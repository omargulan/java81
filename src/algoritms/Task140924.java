package algoritms;

import java.util.Random;
import java.util.Scanner;

public class Task140924 {
    public static void main(String[] args) {
        Random random = new Random();
        int anyNum = random.nextInt(1, 1001);
        Scanner scanner = new Scanner(System.in);
        System.out.println(anyNum);
         while (true){
             int myNum= scanner.nextInt();

             if(myNum<anyNum){
                 System.out.println("menshe");
             }else if(myNum>anyNum){
                 System.out.println("bolshe");
             }else{
                 System.out.println("ugadal");
                 break;
             }

         }

    }
}
