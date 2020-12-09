package com.kiscode.prototype;

/**
 * Description:浅拷贝实现克隆羊案例
 * <p>
 * 实现Cloneable接口，重写clone方法
 * </p>
 * Author: keno
 * Date : 2020/12/9 8:29
 **/
public class Sheep implements Cloneable {
    private int age;
    private String name;
    private String color;

    public Sheep(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
