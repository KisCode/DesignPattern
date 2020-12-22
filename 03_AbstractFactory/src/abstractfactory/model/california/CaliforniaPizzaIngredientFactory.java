package abstractfactory.model.california;

import abstractfactory.PizzaIngredientFactory;
import abstractfactory.model.Cheese;
import abstractfactory.model.Dough;
import abstractfactory.model.Veggies;

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
