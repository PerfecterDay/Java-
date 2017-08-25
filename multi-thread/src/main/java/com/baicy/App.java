package com.baicy;

import com.baicy.runnable.HasSelefPrivateNum;
import com.baicy.runnable.MyThread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        HasSelefPrivateNum hasSelefPrivateNum = new HasSelefPrivateNum();
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        thread1.start();
        thread2.start();
    }
}
