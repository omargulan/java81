package oop;

public class Product {
    String name;
    int price;
    int count;
    public Product(String name, int price){
        this.name=name;
        this.price=price;
    }
    boolean exists(){
        if ((this.count > 0)) {
            return true;
        }
        return false;
    }
}
