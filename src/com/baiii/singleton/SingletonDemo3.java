package com.baiii.singleton;

public class SingletonDemo3 {
    private SingletonDemo3(){}
    private static SingletonDemo3 instance =null;

//    public static SingletonDemo3 getInstance(){
//        if(instance==null){
//            SingletonDemo3 s3;
//            synchronized (SingletonDemo3.class){
//                s3 = instance;
//                if(s3==null){
//                    synchronized (SingletonDemo3.class){
//                        if(s3==null){
//                            s3 = new SingletonDemo3();
//                        }
//                    }
//                    instance = s3;
//                }
//            }
//        }
//        return instance;
//    }
    //习惯这样写，双重检测
    //Double-Check两次if (singleton == null)检查，这样就可以保证线程安全了。
    public static SingletonDemo3 getInstance(){
        if(instance==null){
            synchronized (SingletonDemo3.class){
                if(instance==null){
                    instance= new SingletonDemo3();
                }
            }
        }
        return instance;
    }
}
