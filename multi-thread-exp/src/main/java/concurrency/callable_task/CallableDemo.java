package concurrency.callable_task;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by BaIcy on 2016/12/6.
 */
class TaskWithResult implements Callable<String> {

    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}

public class CallableDemo{
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();

        ArrayList<Future<String>> results = new ArrayList<Future<String>>();

        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(new TaskWithResult(i)));
        }

        for (Future<String> f : results
             ) {

            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}
