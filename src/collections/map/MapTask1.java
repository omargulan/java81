package collections.map;

import Abc.Human;

import java.util.*;

public class MapTask1 {
    public static void main(String[] args) {
        Map<String, Integer> map =new HashMap<>();
        map.put("Москва", 12_100_000);
        map.put("Астана", 1_300_000);
        map.put("Киев", 8_500_000);
        map.put("Нью-Йорк", 7_700_000);

        Collection<Integer> values = map.values();
        Set<String> keys = map.keySet();

        Human human1 = new Human("Sam", 20, "Москва");
        Human human2 = new Human("Tom", 30, "Астана");
        Human human3 = new Human("Alex", 15, "Киев");
        Human human4 =new Human("Ben", 23, "Астана");
        Human human5 =new Human("Ken", 18, "Астана");

        Map<String, Integer> mapHuman =new HashMap<>();
        Map<String, Integer> ageHuman = new HashMap<>();
        Map<String, Integer> countHuman = new HashMap<>();
        Map<String, List<String>> namesHuman = new HashMap<>();

        Human [] arrHuman = new Human[]{human1, human2, human3, human4, human5};

//        for (Human str : arrHuman){
//            mapHuman.put(str.getCityName(), mapHuman.getOrDefault(str.getCityName(), 0) + 1);
//        }
//
//        for (Human str : arrHuman){
//            String city = str.getCityName();
//            int sumAge = str.getAge();
//            ageHuman.put(city, ageHuman.getOrDefault(city, 0) + sumAge);
//            countHuman.put(city, countHuman.getOrDefault(city, 0) + 1);
//        }
        for (Human human : arrHuman) {
            String city = human.getCityName();
            namesHuman.putIfAbsent(city, new ArrayList<>());
            namesHuman.get(city).add(human.getNama() + " (" + human.getAge() + ")");
        }
//        for (Map.Entry<String, Integer> entry : mapHuman.entrySet()){
//            System.out.println(entry.getKey() + " "  + entry.getValue());
//        }
//        for (String str: countHuman.keySet()){
//            int age = ageHuman.get(str);
//            int count = countHuman.get(str);
//            double averageAgeHuman = (double) age / count;
//            System.out.println(str + "  "+ averageAgeHuman);
//        }
        for (Map.Entry<String, List<String>> entry : namesHuman.entrySet()) {
            System.out.println(entry.getKey() +":");

            for (String print: entry.getValue()){
                System.out.println("- " + print);
            }
            //System.out.println("- " + entry.getValue());
        }

        // Астана:
        // - Tom (30)
        // - Ben (23)
        // - Ken (18)
        // Киев:
        // - ...



//        for (Integer value:values){
//            if (value>5_000_000){
//                System.out.println(" - "+  value);
//            }
//
//        }

//        for (String key : keys){
//            if(map.get(key)>0) {
//                System.out.println(key);
//                //System.out.println(key + ": " + map.get(key));
//            }
//        }

//        int max = 0;
//        String maxCity = "";
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > max) {
//                max = entry.getValue();
//                maxCity = entry.getKey();
//            }
//        }
//        System.out.println(maxCity);
//        System.out.println(max);



    }
}
