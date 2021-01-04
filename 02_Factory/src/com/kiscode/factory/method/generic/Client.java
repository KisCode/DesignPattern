package com.kiscode.factory.method.generic;

/**
 * Description:
 * Author: keno
 * Date : 2020/12/22 15:23
 **/
public class Client {
    public static void main(String[] args) {
        Foo<Integer> integerFoo = new Foo<>(new IntegerFactory());
        System.out.println("integerFoo:" + integerFoo.getX());

        Foo<Widget> widgetFoo = new Foo<>(new WidgetFactory());
        System.out.println("widgetFoo:" + widgetFoo.getX().toString());
    }
}
