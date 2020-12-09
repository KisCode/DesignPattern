package com.kiscode.prototype;

/**
 * Description:深拷贝 实现克隆狗
 * <p>
 *     实现Cloneable接口，重写clone方法，并在clone方法中将对象的全部引用类型变量也要clone
 * </p>
 * Author: keno
 * Date : 2020/12/9 8:38
 **/
public class Dog implements Cloneable {
    private int age;
    private String name;
    private String color;
    private Address address;

    public Dog(int age, String name, String color, Address address) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Dog clone() throws CloneNotSupportedException {
        Dog cloneDog = (Dog) super.clone();
        //深拷贝核心逻辑，连同对象的全部引用类型变量也要clone
        Address cloneAddress = (Address) cloneDog.getAddress().clone();
        cloneDog.setAddress(cloneAddress);
        return cloneDog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}
