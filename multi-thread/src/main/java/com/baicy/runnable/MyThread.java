package com.baicy.runnable;

/**
 * Created by BaIcy on 2017/8/10.
 */
public class MyThread implements Runnable {

    HasSelefPrivateNum hasSelefPrivateNum;

    int num;
    public MyThread(HasSelefPrivateNum hasSelefPrivateNum,int num){
        this.hasSelefPrivateNum = hasSelefPrivateNum;
        this.num = num;
    }

    public MyThread(){}
    StringBuffer stringBuilder = new StringBuffer();

    public void run(){
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(String.valueOf(i)+",");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
