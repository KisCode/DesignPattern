package com.kiscode.factory.simple;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 19:53
 */
public class PizzaStore {
    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.orderPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }
}
