package com.kiscode.factory.method;


/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 20:09
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new NYCheesePizza();
        } else if ("veggie".equals(type)) {
            pizza = new NYVeggiaPizza();
        } else {
            pizza = new NYNormalPizza();
        }
        return pizza;
    }
}
