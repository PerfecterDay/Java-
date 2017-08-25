package concurrency.wait_notify;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by BaIcy on 2016/12/21.
 */

class Car{
    private boolean waxOn = false;

    public synchronized void waxed(){
        waxOn = true;
        notify();
    }

    public synchronized void waitforbuffing() throws InterruptedException{
        while (true == waxOn){
            wait();
        }
    }

    public synchronized void buffed(){
        waxOn = false;
        notify();
    }

    public synchronized void waitforWax() throws InterruptedException{
        while (false == waxOn){
            wait();
        }
    }
}


class WaxOn implements Runnable{

    private Car car;
    public WaxOn(Car car){
        this.car = car;
    }


    public void run(){
        try {
            while (!Thread.interrupted()){
                System.out.print("Wax on! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                car.waitforbuffing();
            }
        }catch (InterruptedException e){
            System.out.println("Exiting via Interupt!");
        }
        System.out.println("Ending Wax on task!");
    }
}


class WaxOff implements Runnable{
    private Car car;
    public WaxOff(Car car){
        this.car = car;
    }

    public void run(){
        try {
            while (!Thread.interrupted()){
                car.waitforWax();
                System.out.print("Wax Off! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();
            }
        }catch (InterruptedException e){
            System.out.println("Exiting via Interupt!");
        }
        System.out.println("Ending Wax Off task!");
    }
}

public class WaxOMatic {
    public static void main(String[] args) throws Exception{
        Car car = new Car();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new WaxOn(car));
        executorService.execute(new WaxOff(car));
        TimeUnit.SECONDS.sleep(5);
        executorService.shutdownNow();
    }
}
