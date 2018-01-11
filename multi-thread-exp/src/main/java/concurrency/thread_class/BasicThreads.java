package concurrency.thread_class;

import concurrency.runnable_task.LiftOff;

import java.util.Random;

/**
 * Created by BaIcy on 2016/12/6.
 */
public class BasicThreads{
    public static void main(String[] args) throws InterruptedException {
        LiftOff liftOff = new LiftOff();
        Thread thread = new Thread(liftOff);
        thread.setName("A");
        thread.start();
        Thread.sleep(100);
        liftOff.setName("B");
        liftOff.start();


//        for (int i = 0; i < 10; ++ i ){
//            new Thread(new LiftOff()).start();
//        }
//        for (int i = 0; i < 10; i++) {
//            new ThreadTest().start();
//        }
//        Thread t = new Thread(new LiftOff());
//        t.start();
//
//        try {
//            t.join();
////            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Waiting for LiftOff...");

    }
}

class ThreadTest extends Thread{

    @Override
    public void run() {
        Random random = new Random(10);
        int x = random.nextInt();
        System.out.println(""+x);
    }
}
