package com.kiscode.singleton;

/****
 * Description:单例模式（急切模式） 又叫 饿汉模式
 *
 * 1. 私有化构造函数
 * 2. 声明静态类对象 并初始化实例
 * 3. 公共静态方法获取类实例
 *
 * 优点：在ClassLoader加载这个类时，马上创建此类的单例实例。
 * 线程安全：保证了任何类访问静态变量前已经创建了类实例
 * 缺点：预加载造成性能浪费；
 * Author:  keno
 * CreateDate: 2020/11/18 21:40
 */
public class SingletonEagerly {
    private static SingletonEagerly mInstance = new SingletonEagerly();

    private SingletonEagerly() {
    }

    public static SingletonEagerly getInstance() {
        return mInstance;
    }
}
