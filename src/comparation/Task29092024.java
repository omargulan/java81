package comparation;
import java.util.ArrayList;
import java.util.List;



public class Task29092024 {
    public static void main(String[] args) {
        List<Category> categories = new ArrayList<>();

        Category dairy = new Category("Молочные продукты");
        dairy.addProduct(new Product("Кефир", 420, 7));
        dairy.addProduct(new Product("Творог", 900, 5));
        dairy.addProduct(new Product("Сметана", 600, 2));
        categories.add(dairy);

        Category fruits = new Category("Фрукты");
        fruits.addProduct(new Product("Бананы", 1280, 5));
        fruits.addProduct(new Product("Яблоки", 900, 50));
        fruits.addProduct(new Product("Ананасы", 3800, 24));
        categories.add(fruits);

        Category vegetables = new Category("Овощи");
        vegetables.addProduct(new Product("Помидоры", 420, 14));
        vegetables.addProduct(new Product("Огурцы", 900, 14));
        vegetables.addProduct(new Product("Морковь", 380, 32));
        categories.add(vegetables);

        Category meat = new Category("Мясо");
        meat.addProduct(new Product("Курица", 1280, 90));
        meat.addProduct(new Product("Говядина", 1900, 180));
        categories.add(meat);

        Category cereals = new Category("Крупы");
        cereals.addProduct(new Product("Гречка", 600, 730));
        cereals.addProduct(new Product("Рис", 420, 550));
        cereals.addProduct(new Product("Овсянка", 380, 120));
        categories.add(cereals);

        ProductComparator comparator = new ProductComparator();
//        for (Category category : categories){
//            List<Product> products = category.products();
//            System.out.println(category.name());
//            products.sort(comparator);
//            for (Product product: products){
//                System.out.println(product);
//            }
//        }
        List<Product> productsList = new ArrayList<>();
        for (Category category: categories){
            //List<Product> products = category.products();
            productsList.addAll(category.products());
            //System.out.println(category.name());
//            for (Product product: products){
//                System.out.println(product);
//            }
        }
        productsList.sort(comparator);

        for (Product product : productsList) {
            System.out.println(product);
        }


        // Все категории и списки их товаров отсортированы по убыванию стоимости
        // Молочные продукты
        // Product[name=Творог, price=900.0, expiringDays=5]
        // Product[name=Сметана, price=600.0, expiringDays=2]
        // Product[name=Кефир, price=420.0, expiringDays=7]
        //
        // Овощи
        // Product[name=Огурцы, price=900.0, expiringDays=14]
        // Product[name=Помидоры, price=420.0, expiringDays=14]
        // Product[name=Морковь, price=380.0, expiringDays=32]
        //
        // Фрукты
        // Product[name=Ананасы, price=3800.0, expiringDays=24]
        // Product[name=Бананы, price=1280.0, expiringDays=5]
        // Product[name=Яблоки, price=900.0, expiringDays=50]
        //
        // Мясо
        // Product[name=Говядина, price=1900.0, expiringDays=180]
        // Product[name=Курица, price=1280.0, expiringDays=90]
        //
        // Крупы
        // Product[name=Гречка, price=600.0, expiringDays=730]
        // Product[name=Рис, price=420.0, expiringDays=550]
        // Product[name=Овсянка, price=380.0, expiringDays=120]
    }
}