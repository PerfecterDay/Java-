package concurrency.synchronized_exp;

/**
 * Created by BaIcy on 2016/12/8.
 */
public abstract class IntGenerator {
    private volatile boolean cancled = false;
    public abstract int next();
    public void cancel() {cancled = true;}
    public boolean isCancled(){return  cancled;}
}
