package concurrency.synchronized_exp;

/**
 * Created by BaIcy on 2016/12/8.
 */
public class EvenGenerator extends IntGenerator {

    private int currentEvenVal = 0;

    /*同步方法*/
    public synchronized int next(){
        ++currentEvenVal;
        Thread.yield();
        ++currentEvenVal;
        return currentEvenVal;
    }

    public static void main(String[] args){
        EvenChecker.test(new EvenGenerator(),3);
        System.out.println(Integer.valueOf(null));
        System.out.println(Integer.valueOf("3"));
    }
}
