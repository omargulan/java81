package algoritms;

public class MainAlgoritm {
    public static void main(String[] args) {
        //int[] array = {1, 2, 65, 3, 5, 7, 54, 12, 46, 4, 2};
        int[] array = {1, 2, 3, 5, 7, 54, 65};

        System.out.println(isSorted(array));
//        System.out.println("Индекс искомого элемента: " + find(array, 46));
    }

    public static int find(int[] array, int elem) {
        for (int i = 0; i < array.length; i++)
        {
            if(elem==array[i]){
                return i;
            }

        }
        return -1;
    }
    public static boolean isSorted (int[] nums){

        for (int i  = 0; i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }


        }
        return true;
    }
}
