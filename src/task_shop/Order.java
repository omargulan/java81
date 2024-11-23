package task_shop;

public class Order {
    private int sum;
    private ArrDiscount[] arrDiscount;

    public Order(int sum){
        this.sum=sum;
    }
    public Order(int sum, ArrDiscount[] arrDiscount){
        this.arrDiscount = new ArrDiscount[]{};

    }

    public int getTotalWithDiscount(){
        return this.sum;

    }
}
