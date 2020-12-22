package com.kiscode.factory.method.pizza;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 20:03
 */
abstract class Pizza {
    protected String name;

    public Pizza() {
    }

    public Pizza(String name) {
        this.name = name;
    }


    public void prepare() {
        System.out.println(name + "\tPizza prepare");
    }

    public void bake() {
        System.out.println(name + "\tPizza bake");
    }

    public void box() {
        System.out.println(name + "\tPizza box");
    }
}
