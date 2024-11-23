package files;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("src/files/file.txt");
        BufferedReader bf = new BufferedReader(reader);

        List<User> usersList = new ArrayList<>();
        bf.readLine();
        while (bf.ready()){
            String line = bf.readLine();
            //System.out.println(line);
            String[] str = line.split(",");

            int id = Integer.parseInt(str[0]);
            int age = Integer.parseInt(str[2]);
            User users = new User(id, str[1], age);
            usersList.add(users);



        }
        for (User usr: usersList){

            System.out.println(usr.getId()+" "+usr.getName()+" "+usr.getAge());

        }

        //System.out.println(usersList);
        reader.close();



    }
}
