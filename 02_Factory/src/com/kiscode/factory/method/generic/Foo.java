package com.kiscode.factory.method.generic;

/**
 * Description: 通过工厂方法创建产品类，产品类为泛型
 * Author: keno
 * Date : 2020/12/22 15:22
 **/
public class Foo<T> {
    T x;

    public Foo(T x) {
        this.x = x;
    }


    public <F extends FactoryInterface<T>> Foo(F factory) {
        x = factory.create();
    }

    public T getX() {
        return x;
    }
}
