package com.chinaums.baicy;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {

        Component component = new ConcretComponentA();

        DecoratorA decoratorA = new DecoratorA(component);

        System.out.println( decoratorA.oprate() );

        DecoratorB decoratorB = new DecoratorB(decoratorA);
        System.out.println( decoratorB.oprate() );

    }
}
