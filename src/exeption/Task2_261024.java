package exeption;
import java.net.MalformedURLException;
import java.net.URL;

public class Task2_261024 {
    public static void main(String[] args) throws Exception {
        System.out.println(convertStringToUrl("https://google.com"));
    }

    public static URL convertStringToUrl(final String input) throws MalformedURLException{
        return new URL(input);
    }
}

