package oop2;

public class Product {
    private String name;
    private int price;
    public boolean exists(){
        return this.count>0;
    }
    int count;
    public Product(String name, int price){
        this.name=name;
        this.price=price;
    }



    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name =name;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price=price;
    }


}
