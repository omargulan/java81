package hash_equals;

public class HashEqualsMain {
    public static void main(String[] args) {
        Message m1 = new Message("abcd");
        Message m2 = new Message("abc");
        System.out.println(m1==m2);
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.hashCode()==m2.hashCode());
        System.out.println("---------");

        Human h1 = new Human("Астана", "Даурен", 30);
        Human h2 = new Human("Астана", "Даурен", 30);
        System.out.println(h1.equals(h2));
        System.out.println(h1.hashCode()==h2.hashCode());

    }
}
