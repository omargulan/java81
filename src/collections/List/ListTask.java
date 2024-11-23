package collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListTask {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "a", "a", "c", "a", "d", "a", "a", "e");
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "a", "b");
        String[] arr = new String[]{"Astana", "Karaganda", "Kokshetau", "Semei", "Karaganda", "Semei", "Astana", "Astana"};
        List<String> list4 = new ArrayList<>();
        Collections.addAll(list4,"Astana", "Karaganda", "Kokshetau", "Semei", "Karaganda", "Semei", "Astana", "Astana");
        List<String> list3 = new ArrayList<>();
        for (int i = list4.size()-1; i >=0; i--) {

        }
        System.out.println(list4);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i].equals(arr[j]) && !list3.contains(arr[i])) {
//                    list3.add(arr[i]);
//                    break;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//
//                if (arr[i].equals(arr[j]) && !list3.contains(arr[i])) {
//                    if (arr[i]) list3.add(arr[i]);
//                    list3.add(arr[i]);
//                    break;
//                }
//            }
//        }
//        System.out.println(list3);

        for (String c : arr) {
            list3.add(c);
        }
        //System.out.println(list3);

//        for (int i = list.size() - 1; i >= 0; i--) {
//            if (list.get(i).equals("a")) {
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
//        for (int i = 0; i <= (list.size() - 1); i++) {
//            if (list.get(i).equals("a")) {
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//                if (list2.get(j).equals(list.get(i))) {
//                    list.remove(i);
//                }
//            }
//
//        }
//        System.out.println(list);


        for (int i = list.size()-1; i >=0; i--) {
            if (list2.contains(list.get(i))) {
                list.remove(i);

            }

        }
        System.out.println(list);
    }
}
