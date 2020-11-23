package com.kiscode.factory.abstractfactory.model.pizza;

import com.kiscode.factory.abstractfactory.PizzaIngredientFactory;
import com.kiscode.factory.abstractfactory.model.Pizza;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 21:18
 */
public class VeggiaPizza extends Pizza {

    public VeggiaPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();

        bake();
        box();
    }
}
