package com.kiscode.factory.abstractfactory;

import com.kiscode.factory.abstractfactory.model.Pizza;
import com.kiscode.factory.abstractfactory.model.california.CaliforniaPizzaStore;

/****
 * Description:抽象工厂 提供一个接口（包含多个抽象方法的抽象类）用于创建相关或依赖对象家族
 *
 * 1. 抽象工厂 是一个包含多个抽象方法的抽象类，每个产品创建一个产品、
 * 2. 抽象工厂的子类定义了产品被产生的具体方法；
 * Author:  keno
 * CreateDate: 2020/11/23 21:25
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new CaliforniaPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza.prepare();
    }
}
