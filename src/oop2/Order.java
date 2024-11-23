package oop2;

public class Order {
    private int percent;
    private Product[] products;
    public Order(int percent, Product[] products){
        this.percent = percent;
        this.products=products;
    }

    public int getPercent(){
        return this.percent;
    }
    public void setPercent(int percent){
        this.percent = percent;
    }
    public Product[] getProducts(){
        return this.products;
    }
    public void setProducts(Product[] products){
        this.products=products;
    }
    public int totalSum(){
        int sum=0;
        for (int i = 0; i< products.length; i++){
            sum = sum + products[i].getPrice();
        }
        return (sum-sum*percent/100);
    }
}
