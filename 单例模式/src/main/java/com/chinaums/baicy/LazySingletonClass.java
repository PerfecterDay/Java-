package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/6/2.
 */



//非线程安全的饿汉单例模式
public class LazySingletonClass {


    private static LazySingletonClass instance;
    private LazySingletonClass(){}


    public static LazySingletonClass getInstance(){

        if(null == instance){
            instance = new LazySingletonClass();
        }

        return instance;

    }



}
