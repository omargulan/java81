package strings;

public class Palindrom {

    public boolean isPolindromeWorld(String str){
        StringBuilder strings = new StringBuilder();
        strings.append(str);
        if (str.equals(strings.reverse().toString())){
            return true;
        } else return false;
    }

}
