package my_list;

public class MyListMain2 {

    public static void main(String[] args) {

        MyList myList1 = new MyArrayList();
        myList1.add("a");
        myList1.add(null);
        myList1.add("b");
        myList1.add("d");
        //myList1.add("c");

        MyList myList2 = new MyArrayList();
        myList2.add("a");
        myList2.add("b");
        myList2.add(null);

        System.out.println(myList1); // [a, null, b]
        System.out.println(myList2); // [a, b, null]

        System.out.println(myList1.equals(myList2));
        System.out.println(myList1.hashCode());
        System.out.println(myList2.hashCode());
        System.out.println(myList1.indexOf("x"));

    }
}
