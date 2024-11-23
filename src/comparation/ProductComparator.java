package comparation;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.price() - o1.price());
    }
}
