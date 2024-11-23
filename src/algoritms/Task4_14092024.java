package algoritms;

import java.util.Arrays;

public class Task4_14092024 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr){
        int[] con = new int[arr.length];
        for (int i = arr.length-1; i>=0; i--){
            con[arr.length-i-1] = arr[i];

        }
        System.out.println(Arrays.toString(con));
        arr=con;
    }
}
