package concurrency.synchronized_exp;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by BaIcy on 2016/12/8.
 */
public class EvenChecker implements Runnable {

    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator g, int id){
        generator = g;
        this.id = id;
    }


    public static void test(IntGenerator gp, int count){
        System.out.println("Press Ctrl-C to exit...");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(gp,i));
        }
        exec.shutdown();
    }

    public static void test(IntGenerator gp){
        test(gp,10);
    }

    public void run() {
        while (!generator.isCancled()){
            int val = generator.next();
            if (val % 2 != 0){
                System.out.println("Thread id: "+id +" and-->"+val + " is not even!");
                generator.cancel();
            }
        }
    }
}
