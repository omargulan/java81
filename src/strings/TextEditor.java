package strings;

import java.util.Locale;

public class TextEditor {
    private  boolean isCapsLock = false;
    public void capsLock(){
        if (!isCapsLock){
            isCapsLock = true;
        } else isCapsLock = false;

    }
    public  void print(String str){
        if (isCapsLock){
            System.out.println(str.toUpperCase());
        }else {
            System.out.println(str.toLowerCase());
        }
    }
}
