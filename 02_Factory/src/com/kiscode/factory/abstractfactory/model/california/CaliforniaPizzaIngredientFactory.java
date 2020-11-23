package com.kiscode.factory.abstractfactory.model.california;

import com.kiscode.factory.abstractfactory.PizzaIngredientFactory;
import com.kiscode.factory.abstractfactory.model.Cheese;
import com.kiscode.factory.abstractfactory.model.Dough;
import com.kiscode.factory.abstractfactory.model.Veggies;
import com.kiscode.factory.abstractfactory.model.california.CaliforniaCheese;
import com.kiscode.factory.abstractfactory.model.california.CaliforniaDough;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 21:22
 */
public class CaliforniaPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new CaliforniaCheese();
    }

    @Override
    public Dough createDough() {
        return new CaliforniaDough();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Veggies()};
    }
}
