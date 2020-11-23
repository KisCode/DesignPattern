package com.kiscode.factory.abstractfactory.model.california;

import com.kiscode.factory.abstractfactory.PizzaIngredientFactory;
import com.kiscode.factory.abstractfactory.PizzaStore;
import com.kiscode.factory.abstractfactory.model.Pizza;
import com.kiscode.factory.abstractfactory.model.pizza.CheesePizza;
import com.kiscode.factory.abstractfactory.model.pizza.OhterPizza;
import com.kiscode.factory.abstractfactory.model.pizza.VeggiaPizza;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 21:27
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza orderPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new CaliforniaPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("California cheese style");
        } else if ("veggia".equals(type)) {
            pizza = new VeggiaPizza(pizzaIngredientFactory);
            pizza.setName("California veggia style");
        } else {
            pizza = new OhterPizza(pizzaIngredientFactory);
            pizza.setName("California other style");
        }
        return pizza;
    }
}
