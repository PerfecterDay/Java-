/**
 * Created by BaIcy on 2017/1/5.
 */
public class ExceptionSilencer {


    public static void main(String[] args){
        A a = new A();
        B b = new B();
        System.out.println(a.test());
        System.out.println(b.test());
        a.func();
    }



}


class A {
    public int test(){
        return 0;
    }
    public void func(){
        try{
            throw new Exception();
        }finally {
            return;  //编译器忽略了未处理的异常
        }
    }
}


class B extends A{
    public void funcB() throws Exception{
            throw new Exception();

    }
}