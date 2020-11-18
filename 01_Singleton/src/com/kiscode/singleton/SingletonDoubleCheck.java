package com.kiscode.singleton;

/****
 * Description: 单例模式（双重检查模式）
 *
 * 为了解决线程安全，引入了synchronized同步锁，但只需保证创建对象线程安全即可，如果整个getInstance方法加上同步锁会降低性能，所以仅在第一次先检查 实例为空，才synchronized；
 * 进入synchronized方法块后，再检查一次实例为空，才初始化
 *
 * 优点：线程安全，效率高
 * Author:  keno
 * CreateDate: 2020/11/18 21:57
 */
public class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck mInstance;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance() {
        if (mInstance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (mInstance == null) {
                    mInstance = new SingletonDoubleCheck();
                }
            }
        }
        return mInstance;

    }
}
