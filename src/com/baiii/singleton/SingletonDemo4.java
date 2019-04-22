package com.baiii.singleton;

/*在静态代码码中创建对象 只会被 创建一次  在类加载的时候就会被创建 类似于饿汉式 */
/*public class SingletonDemo4 {
    private SingletonDemo4(){}

    private static SingletonDemo4 instance;

    static {
        instance = new SingletonDemo4();
    }

    public static SingletonDemo4 getInstance(){
        return instance;
    }
}*/

// 这是标准饿汉式？ 加了个final 效率和上面一样
/*
public class SingletonDemo4 {
    private SingletonDemo4(){}

    private static final SingletonDemo4 instance = new SingletonDemo4();

    public static SingletonDemo4 getInstance(){
        return instance;
    }
}
*/

/*这个意思 用私有内部类 还有lazy_loading的功能 可以在实例化的时候才返回
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，没有Lazy-Loading的作用，而静态内部类方式在Singleton类被装载时并不会立即实例化，
 * 而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。 */
public class SingletonDemo4 {
    private SingletonDemo4(){}

    private static class SingletonInstance{
        private static final SingletonDemo4 Instance = new SingletonDemo4();

    }

    public static SingletonDemo4 getInstance(){
        return SingletonInstance.Instance;
    }
}

