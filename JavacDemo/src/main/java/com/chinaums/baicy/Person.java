package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/7/19.
 */
public class Person {

    int age;
    String name;
    long weight;

    Person(int x){

    }

    public  int  walk(){
        return 0;
    }

}


class Man extends Person{

    public void run(){

    }

    Man(){
        super(1);
    }

    Man(int x){
        super(x);
    }

    public int walk(){
        return  1;
    }


    public static void main(String[] args){
        System.out.println(Math.round(-1.5));
        String string = new String("abc");
        String s = "123";


        switch ("a"+"b"){
            case "a":
        }
        Person man = new Man();
        System.out.println(man.walk());
    }
}


