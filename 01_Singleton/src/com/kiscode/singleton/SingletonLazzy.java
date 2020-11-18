package com.kiscode.singleton;

/****
 * Description:
 * 单例模式（懒汉模式）
 * 1. 私有化构造函数
 * 2. 声明静态类对象
 * 3. 公共静态方法获取类实例，当实例不为空则通过私有构造函数初始化
 * Author:  keno
 * CreateDate: 2020/11/18 21:29
 */
public class SingletonLazzy {
    private static SingletonLazzy mInstance;

    private SingletonLazzy() {
    }

    public static SingletonLazzy getInstance() {
        //懒汉模式，仅使用时才初始化
        //此处是线程不安全的，当多线程调用该方法可能会生成多个实例
        if (mInstance == null) {
            mInstance = new SingletonLazzy();
        }
        return mInstance;
    }
}


