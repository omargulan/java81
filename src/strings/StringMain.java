package strings;

import java.util.Arrays;
import java.util.Locale;

public class StringMain {
    public static void main(String[] args) {
//        String str = " Hello";
//        String str2 = "Hello";
//        String str3 = "";
//        String str4 = "     ";
//        System.out.println(fixString(str));
//        System.out.println(fixString(str2));
//        System.out.println(fixString(str3));
//        System.out.println(fixString(str4));

        TextEditor textEditor = new TextEditor();
 //       textEditor.print("hello world");
   //     textEditor.capsLock();
     //   textEditor.print("hello world");
     //   textEditor.capsLock();
     //   textEditor.print("hello world");

     //   System.out.println("Так много методов!".indexOf ("м", 3) == 4);
     //   System.out.println("Как их все запомнить?!".charAt(20)== '?');
     //   System.out.println("Шиншилла".lastIndexOf('и')== 4);

//        String rules = """
//                На зелёный цвет — стой на месте;
//                на зелёный цвет — приготовься;
//                на зелёный — осмотрись, а затем смело шагай.""";
//
//        String replaced = rules.replaceFirst("зелёный", "красный").replace("цвет", "свет").replaceFirst("зелёный", "желтый");
//        System.out.println(replaced);
        Palindrom polindrom = new Palindrom();
        //System.out.println(polindrom.isPolindromeWorld("комок"));
        //System.out.println(polindrom.isPolindromeWorld("как"));
        String months = "ЯНВАРЬ-ФЕВРАЛЬ-МАРТ-АПРЕЛЬ-МАЙ-ИЮНЬ-ИЮЛЬ-АВГУСТ-СЕНТЯБРЬ-ОКТЯБРЬ-НОЯБРЬ-ДЕКАБРЬ";

        System.out.println(months.toLowerCase());
        String[] arr = months.split("-");
        String tmp;
        for (int i = 0; i< arr.length; i++){
            tmp=arr[i].toLowerCase();
            System.out.println((i+1)+". "+tmp.toUpperCase().charAt(0)+tmp.toLowerCase().substring(1));
        }



    }

    public static String fixString(String str){
        if (str.isBlank()){
            return "Вы ничего не ввели!";
        } else{
            return str.trim();
        }
    }

}
