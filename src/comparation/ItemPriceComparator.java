package comparation;
import java.util.List;
import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {


    @Override
    public int compare(Item o1, Item o2) {
        return o1.price- o2.price;
    }
}
