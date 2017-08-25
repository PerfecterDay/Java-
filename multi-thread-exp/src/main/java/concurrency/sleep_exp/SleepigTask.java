package concurrency.sleep_exp;

import concurrency.runnable_task.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by BaIcy on 2016/12/6.
 */
public class SleepigTask extends LiftOff {

    @Override
    public void run() {
        while (countDown >=0 ){
            System.out.print(status());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new SleepigTask());
        }
        executorService.shutdown();
    }
}
