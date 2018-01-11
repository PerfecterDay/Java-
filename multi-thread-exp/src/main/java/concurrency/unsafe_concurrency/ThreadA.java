package concurrency.unsafe_concurrency;

/**
 * Created by BaIcy on 2018/1/11.
 *
 * @author BaIcy
 * @Date 2018/1/11 18:06
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum numRef;


    public ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();

        numRef.addI("a");
    }
}
