package com.chinaums.baicy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){

        Duck duck = new RoketDuck();
        duck.fly();
        duck.quack();
        duck.setFlyBehavior(new BFlyBehavior());
        duck.setQuackBehavior(new AQuackBehavior());
        duck.fly();
        duck.quack();
    }
}
