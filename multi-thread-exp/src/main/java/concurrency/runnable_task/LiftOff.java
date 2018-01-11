package concurrency.runnable_task;

/**
 * Created by BaIcy on 2016/12/6.
 */
public class LiftOff extends Thread {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff(){
        System.out.println("---构造函数开始---");
        System.out.println("Thread.currentThread.getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("----构造函数结束-----");
    }
    public LiftOff(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" +
                (countDown > 0 ? countDown:"LiftOff!") + "),";
    }

    @Override
    public void run() {
        System.out.println("---线程执行函数开始---");
        System.out.println("Thread.currentThread.getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("----线程执行函数结束-----");
        while (countDown >= 0){
            System.out.print(status());
            Thread.yield();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            countDown -- ;
        }
    }
}


