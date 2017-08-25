package com.chinaums.baicy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ASubject subject = new ASubject();
        Observer aObserver = new AObserver("A");
        Observer bObserver = new AObserver("B");

        subject.register(aObserver);

        subject.setX(1);
        subject.setY(2);

        subject.register(bObserver);
        subject.setX(2);
        subject.setY(3);


        System.out.println( "Hello World!" );
    }
}
