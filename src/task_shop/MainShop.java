package task_shop;

public class MainShop {
    public static void main(String[] args) {

        Fixed fixed = new Fixed();
        Special special = new Special();
        Extra extra = new Extra();
        ArrDiscount arr = new ArrDiscount();

        Order o1 = new Order(120_000);
        Order o2 = new Order(222_000);
        Order o3 = new Order(276_000);
        Order o4 = new Order(700_000);

        /*Order[] orders = new Order[]{o1, o2, o3, o4};
        for(Order order: orders){
            System.out.println(order.getTotalWithDiscount());
        }*/
        System.out.println(arr.getDiscount());

    }
}
