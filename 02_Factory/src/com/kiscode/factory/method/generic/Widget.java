package com.kiscode.factory.method.generic;

/**
 * Description:
 * Author: keno
 * Date : 2020/12/22 15:20
 **/
public class Widget {
    private String name;

    public Widget(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "name='" + name + '\'' +
                '}';
    }
}
