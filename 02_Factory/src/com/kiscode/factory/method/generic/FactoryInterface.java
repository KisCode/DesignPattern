package com.kiscode.factory.method.generic;

/**
* Description: 工厂方法模式，通过声明抽象工厂方法创建 泛型产品类，具体由子类类型参数决定居停创建类型
 *  *
 *  * 1. 工厂方法是抽象的，依赖子类处理对象的创建
 *  * 2. 工厂方法必须返回一个抽象类产品
 *  *
 *  * 优点：面向接口编程，解耦
 * Author: keno
 * Date : 2020/12/22 15:19
 **/
public interface FactoryInterface<T> {
    T create();
}
