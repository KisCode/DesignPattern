package com.kiscode.factory.simple;

/****
 * Description:简单工厂本质不是设计模式，而是一种编程习惯
 * 将对象创建抽取到 简单工厂中统一管理
 * Author:  keno
 * CreateDate: 2020/11/23 19:51
 */
public class SimplePizzaFactory {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
        } else {
            pizza = new NormalPizza();
        }
        return pizza;
    }
}
