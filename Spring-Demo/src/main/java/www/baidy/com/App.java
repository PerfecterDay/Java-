package www.baidy.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

abstract class Shape{
    abstract void draw();
}


class Gum extends Shape{

    static {
        System.out.println("Loading Gum");
    }
    private int anInt;
    private int bInt;

    void draw(){}
}


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        String
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("Beans.xml");


        HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
        obj.say();


        Shape gum = new Gum();
        Class o = gum.getClass();
        System.out.println(o.getCanonicalName());
        System.out.println(o.getSimpleName());
        System.out.println(o.getSuperclass().getSimpleName());
        App app = new App();
        app.printClassHirachy(o);
        Class<?> t;
        try {
            t = Class.forName("www.baidy.com.Gum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    void printClassHirachy(Class clz){
        if (clz.getSimpleName().equals("Object")){
            System.out.println("Object");
            return;
        }else{
            System.out.println(clz.getSimpleName());
            printClassHirachy(clz.getSuperclass());
        }
    }
}
