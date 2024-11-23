package oop2;

import java.util.Arrays;

public class Oop2 {

    public static void main(String[] args) {
        // Расписать следующие классы:
        // 1) Товар -> название, стоимость, доступность
        // (есть товар в наличии или нет).
        // 2) Заказ -> скидка как целое число (процент), товары
        // (массив из объектов первого класса).

        // Для заказа реализовать метод получения общей стоимости с
        // учётом скидки, при расчёте общей стоимости нужно
        // учитывать только те товары которые есть в наличии.
        Product product1 = new Product("Хлеб", 150);
        //product1.setName("Хлеб");
        //product1.setPrice(150);
        Product product2 = new Product("Сахар", 400);
        product2.setName("Сахар");
        product2.setPrice(400);
        Product product3 = new Product("Чай", 250);
        product3.setName("Чай");
        product3.setPrice(250);

        Order order = new Order(5, new Product[]{product1, product2, product3} );
        //order.setPercent(5);
        //order.setProducts(new Product[]{product1, product2, product3});
        System.out.println("общ сумма " + order.totalSum());

        //int[] array = new int[]{11, 25, 19};
        //ArrayTask arrayClone = new ArrayTask();
        //arrayClone.setArray(array);
        //int[] clone = arrayClone.getArray();
        //array[1] = 77;
        //System.out.println(Arrays.toString(arrayClone.getArray()));


    }
}
