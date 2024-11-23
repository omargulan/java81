package exeption;
import java.net.URI;

public class Task20102024 {
    public static void main(String[] args) {
        System.out.println(parseStringToURI("https://google.сom"));
        System.out.println(parseStringToURI("\\\\"));
        System.out.println(parseStringToURI(null));
    }

    public static URI parseStringToURI(final String input) {
        try {
            return new URI(input);
        } catch (Throwable ex){
            return null;
        }

    }
}
