# 单例模式（Single） 
- 创建独一无二的对象。

### 使用场景
- 保证一个类仅有一个实例，并提供一个访问它的全局访问点。

### 关键代码
1. 私有化构造函数；
2. 声明静态类对象；
3. 公共静态方法获取类实例，当实例不为空则通过私有构造函数初始化；

 ![单例模式UML](https://github.com/KisCode/DesignPattern/blob/master/imgage/Single.jpg)


### 单例模式的几种常用方式
- 懒汉式
- 饿汉式
- 双向检查模式
- 静态内部类
- 枚举式

#### 懒汉式
```java
/****
 * Description:
 * 单例模式（懒汉模式）
 * 1. 私有化构造函数
 * 2. 声明静态类对象
 * 3. 公共静态方法获取类实例，当实例不为空则通过私有构造函数初始化
 * 缺点：线程不安全；
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
```

#### 饿汉式
```java
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
 */
public class SingletonEagerly {
    private static SingletonEagerly mInstance = new SingletonEagerly();

    private SingletonEagerly() {
    }

    public static SingletonEagerly getInstance() {
        return mInstance;
    }
}
```


#### 双向检查模式
```java
/****
 * Description: 单例模式（双重检查模式）
 *
 * 为了解决线程安全，引入了synchronized同步锁，但只需保证创建对象线程安全即可，如果整个getInstance方法加上同步锁会降低性能，所以仅在第一次先检查 实例为空，才synchronized；
 * 进入synchronized方法块后，再检查一次实例为空，才初始化
 *
 * 优点：线程安全，效率高
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
```


#### 静态内部类
```java
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
```

#### 枚举式
```java
/****
 * Description: 枚举单例
 *
 * 我们通过双重检查方式{@link SingletonDoubleCheck}、急切模式{@link SingletonEagerly}或内部类持有静态对象{@link SingletonIn} 等以上集中方式创建单例对象，
 * 即使构造函数声明为私有，在使用反射的情况仍可以通过构造函数 创建实例
 *
 * 优点： 线程安全，可避免反射创建实例
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
```


### 总结
第一种传统的懒汉模式是线程不安全，多线程场景下不建议使用；
第二种饿汉模式由于类加载时提前初始化了类对象，线程安全但是预加载造成性能浪费；
第三种双重检查模式，采用了双重锁机制，兼顾了性能及线程安全，只是具体实现比以上模式稍微复杂；
第四种静态类方式，线程安全且只有内部类需要加载时才会实例化对象无性能浪费，推荐使用；
第五种枚举方式，需要在极端场景如避免反射方式创建对象时使用；
 

