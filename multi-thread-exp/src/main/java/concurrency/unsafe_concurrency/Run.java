package concurrency.unsafe_concurrency;

/**
 * Created by BaIcy on 2018/1/11.
 *
 * @author BaIcy
 * @Date 2018/1/11 18:09
 */
public class Run {



    public static void main(String[] args){
        HasSelfPrivateNum num = new HasSelfPrivateNum();

        Thread threadA = new ThreadA(num);
        threadA.start();
        Thread threadB = new ThreadB(num);
        threadB.start();
    }
}
