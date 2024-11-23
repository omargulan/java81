package algoritms;

import java.util.Arrays;

public class Task3_14092024 {
    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = {4, 5, 6};
        int[] result = concatenate(first, second);
        System.out.println(Arrays.toString(result));
    }
    static int [] concatenate(int[] first, int[] second){
        int[] con = new int[first.length+ second.length];
        for (int i = 0; i<first.length; i++){
            con[i] = first[i];
        }
        for (int i = 0; i<second.length; i++){
            con[first.length+i] = second[i];
        }
        return con;
    }
}
