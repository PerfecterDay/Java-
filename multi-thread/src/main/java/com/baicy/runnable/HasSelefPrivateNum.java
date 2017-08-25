package com.baicy.runnable;

/**
 * Created by BaIcy on 2017/8/10.
 */
public class HasSelefPrivateNum {
    private int anInt;


    public int setAnInt(int num){
        for (int i = 0; i < 100; i++) {
            if (num == 100){
                anInt = 100;
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                anInt = 200;


            }
            System.out.println(Thread.currentThread().getName()+":"+num);

        }
        return anInt;
    }
}
