package my_list;

public class MyListMain {
    public static void main(String[] args) {
        MyList myList = new MyArrayList();
        myList.add("a");
        myList.add("a");
        myList.add("a");
        myList.add("a");
        myList.add("a");
        myList.add("a");
        myList.add("a");
        //myList.add("a");
        myList.add("b");
        myList.add("c");
        //myList.add("d");
        //myList.add("e");
        //myList.add("f");
        //myList.add("g");
        //myList.add("h");
        //myList.add("j");
        //myList.add("k");
        //myList.add("l");
        //myList.add("m");
        MyList myList2 = new MyArrayList();
        myList2.add("a");
        myList2.add("a");
        myList2.add("a");
        myList2.add("a");
        myList2.add("a");
        myList2.add("a");
        myList2.add("a");
        myList2.add("a");
        myList2.add("a");
        myList2.add("a");
        myList2.add("b");
        myList2.add("c");
        //myList2.add("d");
        myList2.remove(0);
        myList2.remove(0);
        myList2.remove(0);

        System.out.println(myList);
        System.out.println(myList2);

//        myList.add(1, "z");
//        myList.remove(1);
//        myList2.add(1, "z");
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.print(myList.get(i) + " ");
//        }
        System.out.println();
        System.out.println("****************");
        //System.out.println(myList.get(1));

        /*myList.remove(1);
        for (int i =0; i<myList.size(); i++){
            System.out.print(myList.get(i)+" ");
        }*/
        //System.out.println(myList.contains("k"));

        //System.out.println(myList); // [a, z, b, c]

        System.out.println(myList.equals(myList2));
        System.out.println(myList.hashCode() == myList2.hashCode());


    }
}
