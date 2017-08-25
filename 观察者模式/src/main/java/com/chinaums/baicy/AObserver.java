package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/5/19.
 */
public class AObserver implements Observer {

    String name;
    public void update(int x,int y){
        System.out.println(name +", x:"+x+" y:"+y);
    }

    AObserver(String name){
        this.name = name;
    }

    AObserver(){}
    public void setName(String name) {
        this.name = name;
    }
}
