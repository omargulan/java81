package generics.task2;
import java.util.*;

public class ShoppingCart <T extends Clothing> {
    List<T> items = new ArrayList<>();
    public void addItem(T item){
        items.add(item);
    }
    public void removeItem(T item){
        items.remove(item);

    }
    public double calculateTotal(){
        double sum=0;
        for (T item: items){
//            System.out.println(item.getPrice());
            sum += item.getPrice();
        }
        return sum;
    }
    public void printItems(){
        for (T item: items){
            System.out.println(item.getName());
        }

    }
}
