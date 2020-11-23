package com.kiscode.factory.simple;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/23 19:37
 */
class Pizza {
    protected String name;

    public void prepare() {
        System.out.println("Pizza prepare");
    }

    public void bake() {
        System.out.println("Pizza bake");
    }

    public void box() {
        System.out.println("Pizza box");
    }

}

class CheesePizza extends Pizza {
}

class NormalPizza extends Pizza {
}

class VeggiePizza extends Pizza {
}


