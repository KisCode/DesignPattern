package com.kiscode.singleton;

/****
 * Description: 枚举单例
 *
 * 我们通过双重检查方式{@link SingletonDoubleCheck}、急切模式{@link SingletonEagerly}或内部类持有静态对象{@link SingletonIn} 等以上集中方式创建单例对象，
 * 即使构造函数声明为私有，在使用反射的情况仍可以通过构造函数 创建实例
 *
 * 优点： 线程安全，可避免反射创建实例
 * Author:  keno
 * CreateDate: 2020/11/18 22:21
 */
public enum SingletonEnum {
    INSTANCE;

    public SingletonEnum getInstance() {
        //此处方法多余，根据枚举特性可直接通过访问单例对象 SingletonEnum.INSTANCE
        return INSTANCE;
    }

    public void testMethod() {
        //Do SomeThing
    }
}
