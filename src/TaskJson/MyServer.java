package TaskJson;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

public class MyServer {
    static Gson gson = new Gson();
    static List<User> users = new ArrayList<>(List.of(
            new User(1,"Tom", 57, "Hanks"),
            new User(2,"Paul", 86, "McCartney"),
            new User(3,"John", 46, "Lennon")
    ));
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/users", MyServer::handleUsers);
        server.start();
    }

    // insomnia
    // GET localhost:8080/users - получить список пользователей
    // POST localhost:8080/users - создание пользователя
    // PUT localhost:8080/users - обновление пользователя
    // PATCH localhost:8080/users - частичное обновление пользователя
    // DELETE localhost:8080/users - удаление всех пользователей
    public static void handleUsers(HttpExchange exchange) throws IOException {
        String path = exchange.getRequestURI().getPath();

        System.out.println(id);


        //exchange.sendResponseHeaders(200, 0);
        Gson gson = new Gson();

        String method = exchange.getRequestMethod();
        String response;
        switch (method){

            case "GET" -> {
                exchange.sendResponseHeaders(200, 0);
                response = gson.toJson(users);
            }
            case "POST" -> {
                InputStream inputStream = exchange.getRequestBody();
                byte[] bytes = inputStream.readAllBytes();
                String body = new String(bytes);
                System.out.println(body);
                User user = gson.fromJson(body, User.class);


                if(user.getAge()<0){
                    exchange.sendResponseHeaders(400, 0);
                    response = "Возрост не может быть отрицательный";
                    break;
                }
                if (user.getName() == null || user.getName().isBlank()
                        || user.getLastname() == null || user.getLastname().isBlank()){
                    exchange.sendResponseHeaders(400, 0);
                    response = "имя и фамилия не должен быть пустым";
                    break;
                }
                user.setId(users.size()+1);

                exchange.sendResponseHeaders(201, 0);

                users.add(user);
                response = gson.toJson(user);
            }
            default -> {
                exchange.sendResponseHeaders(405, 0);
                response = "Неподдкрживаемы метод";
            }
        }

//        User user = new User("Bob", 43, "Dylan");
//        String response = gson.toJson(user);
        try (OutputStream responseBody = exchange.getResponseBody()) {
            responseBody.write(response.getBytes());
        }
    }
}
