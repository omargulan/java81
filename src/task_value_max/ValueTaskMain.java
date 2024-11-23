package task_value_max;

public class ValueTaskMain {
    public static void main(String[] args) {
        /*Object x = null;
        x.equals(new Object());*/

        Value value1 = new Value(5);
        Value value2 = new Value(5);
        value1.add("val1");
        value2.add("val1");
        value1.add("val2");
        value2.add("val2");
        value1.add("val3");
        value2.add("val3");
        //value1.add("val4");
        //value1.add("val5");
        //value1.add("val6");
        //value1.print();
        System.out.println(" ");
        System.out.println(value1.equals(value2));

        System.out.println(value1.hashCode());
        System.out.println(value2.hashCode());
        System.out.println(value1.hashCode()==value2.hashCode());

    }
}
