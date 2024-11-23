package algoritms;
import java.util.Arrays;

public class Ex15092024 {
    public static void main(String[] args) {


        int[] first = {1,3,5};
        int[] second = {2,4,6};
        int[] mergedArray = merge(first, second);
        System.out.println(Arrays.toString(mergedArray));
    }

    // TODO
    static int[] merge(int[] leftArray, int[] rightArray) {
        //
        int[] result = new int[leftArray.length+ rightArray.length];
        for (int i = 0; i < leftArray.length; i++){
            result[i]=leftArray[i];
        }
        for (int i = 0; i < rightArray.length; i++){
            result[i+leftArray.length]=rightArray[i];
        }

        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }


        return result;
    }
}
