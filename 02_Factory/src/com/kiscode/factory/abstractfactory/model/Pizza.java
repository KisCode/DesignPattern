package com.kiscode.factory.abstractfactory.model;

import com.kiscode.factory.abstractfactory.PizzaIngredientFactory;

/****
 * Description:Pizza原料-素菜
 * Author:  keno
 * CreateDate: 2020/11/23 21:06
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Cheese cheese;
    protected Veggies veggies[];

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Pizza bake");
    }

    public void box() {
        System.out.println("Pizza box");
    }

    public void setName(String name) {
        this.name = name;
    }
}
