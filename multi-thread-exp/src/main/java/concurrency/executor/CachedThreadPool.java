package concurrency.executor;

import concurrency.runnable_task.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by BaIcy on 2016/12/6.
 */
public class CachedThreadPool {

    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        ExecutorService exec2 = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
        System.out.println("-----");

        for (int i = 0; i < 10; i++) {
            exec2.execute(new LiftOff());
        }

        exec2.shutdown();
    }
}
