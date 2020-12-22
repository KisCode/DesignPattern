package abstractfactory.model.pizza;

import abstractfactory.PizzaIngredientFactory;
import abstractfactory.model.Pizza;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 21:18
 */
public class OhterPizza extends Pizza {

    public OhterPizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
