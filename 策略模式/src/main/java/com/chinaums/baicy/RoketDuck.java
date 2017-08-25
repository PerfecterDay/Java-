package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/5/18.
 */
public class RoketDuck extends Duck {

    @Override
    public void display(){
        System.out.println("RocketDuck display...");
    }


    RoketDuck(){
        setFlyBehavior(new AFlyBehavior());
        setQuackBehavior(new BQuackBehavior());
    }







}
