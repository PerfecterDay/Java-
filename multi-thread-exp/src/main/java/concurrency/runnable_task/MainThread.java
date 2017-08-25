package concurrency.runnable_task;

/**
 * Created by BaIcy on 2016/12/6.
 */
public class MainThread {
    public static void main(String[] args){

        /*并没有创建多个线程，只是创建了4个runnable对象，
        * 这些对象任务均运行在Main所在的线程中*/
        LiftOff launch = new LiftOff();
        LiftOff launch1 = new LiftOff();
        LiftOff launch2 = new LiftOff();
        LiftOff launch3 = new LiftOff();
        launch.run();
        launch1.run();
        launch2.run();
        launch3.run();
        System.out.println("All tasks started...");
        try{
//            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
