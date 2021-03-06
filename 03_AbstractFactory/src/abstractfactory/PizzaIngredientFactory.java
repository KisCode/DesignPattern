package abstractfactory;

import abstractfactory.model.Cheese;
import abstractfactory.model.Dough;
import abstractfactory.model.Veggies;

/****
 * Description: Pizza原料工厂
 * Author:  keno
 * CreateDate: 2020/11/23 21:15
 */
public abstract class PizzaIngredientFactory {
    //生产奶酪
    public abstract Cheese createCheese();

    //生产面团
    public abstract Dough createDough();

    //生产 蔬菜
    public abstract Veggies[] createVeggies();
}
