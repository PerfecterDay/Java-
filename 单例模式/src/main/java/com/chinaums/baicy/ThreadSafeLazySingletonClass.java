package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/6/2.
 */


//线程安全的饿汉单例模式
public class ThreadSafeLazySingletonClass {

    private volatile static ThreadSafeLazySingletonClass instance;


    private ThreadSafeLazySingletonClass(){}


    public static ThreadSafeLazySingletonClass getInstance(){
        if (null == instance){
            synchronized (ThreadSafeLazySingletonClass.class){
                if (null == instance){
                    instance = new ThreadSafeLazySingletonClass();
                }
            }
        }
        return instance;
    }


}
