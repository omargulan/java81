package Abc;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTask2 {

    public static void main(String[] args) {
        Map<String, int[]> map = new LinkedHashMap<>();
        map.put("a", new int[]{1, 200});
        map.put("b", new int[]{3, 4, 5});
        map.put("c", new int[]{1, 2, 6, 7});

        int max = Integer.MIN_VALUE;
        String maxKey = null;
        for (Map.Entry<String, int[]> entry : map.entrySet()){
            //System.out.print(entry.getKey() + ": ");

            int sum = 0;
            for (int arr: entry.getValue()){
                sum=sum+arr;
            }

            if (sum>max){
                max = sum;
                maxKey = entry.getKey();
            }

        }
        System.out.println(maxKey + " " + max);
        //System.out.println(sum);
    }
}
