package comparation;
import java.util.ArrayList;
import java.util.List;

public record Category(String name, List<Product> products) {
    public Category(String name) {
        this(name, new ArrayList<>());
    }



    public void addProduct(Product product) {
        products.add(product);
    }

    // TODO: реализовать метод для получения сумму всех товаров категорий
    public double getProductsSum() {
        return 0.0;
    }
}
