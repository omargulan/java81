package algoritms;

public class Task2_14092024 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = countEven(nums);
        System.out.println(result);
    }
    static int countEven(int[] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
