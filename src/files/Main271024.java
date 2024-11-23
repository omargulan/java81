package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main271024 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/files/reports");
        if (!Files.exists(path)){
            Files.createDirectory(path);
            System.out.println("created dir");
        } else System.out.println("папка уже есть");


           for (int i = 1; i<=5; i++){
               Path pathFiles = Paths.get("src/files/reports/report"+i+".txt");
               if (!Files.exists(pathFiles)){
                   Files.createFile(pathFiles);
               } else System.out.println("файлы есть");
            }
           System.out.println("created files");
    }
}
