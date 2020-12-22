package com.kiscode.factory.method.pizza;


/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 20:09
 */
public class MiamiPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new MiamiCheesePizza();
        } else {
            pizza = new MiamiNormalPizza();
        }
        return pizza;
    }
}
