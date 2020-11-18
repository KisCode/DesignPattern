package com.kiscode.singleton;

/****
 * Description:单例模式（内部类实现）
 *  *
 *  * 1. 私有化构造函数
 *  * 2. 声明静态内部类SingletonInHolder，并在内部类中声明静态单例类对象实例
 *  * 3. 公共静态方法获取类实例，相比{@link SingletonEagerly}预加载造成性能浪费，内部类是在需要实例化时，调用getInstance方法，才会加载SingletonInHolder类
 *  *
 *  * 优点：线程安全，延迟加载
 * Author:  keno
 * CreateDate: 2020/11/18 21:49
 */
public class SingletonIn {
    private SingletonIn() {
    }

    public static SingletonIn getInstance() {
        return SingletonInHolder.mInstance;
    }

    private static class SingletonInHolder {
        static SingletonIn mInstance = new SingletonIn();
    }


}
