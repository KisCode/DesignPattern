package abstractfactory;

import abstractfactory.model.Pizza;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 21:12
 */
public abstract class PizzaStore {

    protected abstract Pizza orderPizza(String item);
}
