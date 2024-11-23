package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 3);
        map.put("b", 1);
        map.put("c", 2);
        map.put("d", 4);
        map.put("e", 5);
        map.put("a", 3);
        System.out.println(map);

    }
}
