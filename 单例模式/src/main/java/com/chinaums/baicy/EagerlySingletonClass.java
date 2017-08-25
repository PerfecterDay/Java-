package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/6/2.
 */


//线程安全的饱汉单例模式
public class EagerlySingletonClass {

    private static EagerlySingletonClass instance
            = new EagerlySingletonClass();

    private EagerlySingletonClass(){}


    public static EagerlySingletonClass getInstance(){
        return instance;
    }
}
