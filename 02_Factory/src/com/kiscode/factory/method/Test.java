package com.kiscode.factory.method;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 20:17
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");

        PizzaStore miamiPizzaStore = new MiamiPizzaStore();
        miamiPizzaStore.orderPizza("cheese");

    }
}
