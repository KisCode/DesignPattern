package abstractfactory.model.pizza;

import abstractfactory.PizzaIngredientFactory;
import abstractfactory.model.Pizza;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 21:18
 */
public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        this.name = "California Cheese Pizza";
    }

    @Override
    public void prepare() {
        //通过原料工厂(抽象类 多个抽象方法) 创建原料家族
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();

        bake();
        box();
    }
}
