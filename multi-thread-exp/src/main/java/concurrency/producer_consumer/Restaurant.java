package concurrency.producer_consumer;

/**
 * Created by BaIcy on 2016/12/21.
 */
class Meal{
    private final int orderNum;
    public Meal(int orderNum){
        this.orderNum = orderNum;
    }

    @Override
    public String toString(){
        return "Meal " + orderNum;
    }
}


class WaitPerson implements Runnable{

    public void run(){

    }
}

public class Restaurant {

}
