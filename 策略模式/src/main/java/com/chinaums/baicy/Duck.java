package com.chinaums.baicy;

import lombok.Data;

/**
 * Created by BaIcy on 2017/5/18.
 */
@Data
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("I am swimming...");
    }

    public abstract void display();


    void fly(){
        flyBehavior.fly();
    }

    void quack(){
        quackBehavior.quack();
    }
}
