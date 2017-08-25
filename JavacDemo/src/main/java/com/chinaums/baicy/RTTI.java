package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/7/20.
 */

 class Useful{
    public void f(){};
    public void g(){};
}


class MoreUseful extends Useful{
    public void f(int x){System.out.println("1");};
    public void v(){};
    public void w(){};
}


public class RTTI {


    public  static void main(String[] args){
        Useful[] arr = {
                new Useful(),
                new MoreUseful(),
        };

        arr[0].f();
        arr[0].g();


//        ((MoreUseful) arr[0]).u();
        ((MoreUseful) arr[1]).f(1);
    }


}
