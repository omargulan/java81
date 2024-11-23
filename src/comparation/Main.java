package comparation;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Рубашка", 4500, 37));
        items.add(new Item("Носки", 55, 8));
        items.add(new Item("Толстовка", 1399, 74));
        items.add(new Item("Носки", 169, 19));

        System.out.println("До сортировки:");
        System.out.println(items);
        ItemPopularComparator comparator = new ItemPopularComparator();
        items.sort(comparator);
        System.out.println(items);
    }
}
