package files;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("src/files/numbers.txt");
        BufferedReader bf = new BufferedReader(reader);

        List<Integer> IntList = new ArrayList<>();
        int sum = 0;
        while (bf.ready()){
            String line = bf.readLine();
            int ln = Integer.parseInt(line);
            sum+=ln;


        }
        System.out.println(sum);

        reader.close();



    }
}
