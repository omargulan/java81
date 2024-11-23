package collections.Set;

import java.util.HashSet;
import java.util.Set;

public class TaskSet06102024 {
    public static void main(String[] args) {
        Set<String> allCities = new HashSet<>();

        allCities.add("Алматы");
        allCities.add("Астана");
        allCities.add("Шымкент");
        allCities.add("Актобе");
        allCities.add("Караганда");
        allCities.add("Тараз");
        allCities.add("Павлодар");
        allCities.add("Семей");

        Set<String> usedCities = new HashSet<>();
        usedCities.add("Шымкент");
        usedCities.add("Семей");
        usedCities.add("Павлодар");

        // TODO: вывести не названные города
        Set<String> nonUsedCities = new HashSet<>();
        for (String str : allCities){
            if(!usedCities.contains(str)) {
                nonUsedCities.add(str);
            }
        }
        System.out.println(nonUsedCities);

    }

}
