package com.kiscode.factory.method.pizza;

/****
 * Description: 工厂方法模式，通过声明抽象工厂方法创建 抽象产品类，具体由子类实现，
 *
 * 1. 工厂方法是抽象的，依赖子类处理对象的创建
 * 2. 工厂方法必须返回一个抽象类产品
 *
 * 优点：面向接口编程，解耦
 * Author:  keno
 * CreateDate: 2020/11/23 20:04
 */
abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }


    abstract Pizza createPizza(String type);
}
