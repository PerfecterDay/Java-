package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/8/22.
 */
public class DecoratorA extends Decorator {

    public String getDescription(){
        return "";
    }


    public String oprate(){
        return "DecoratorA " + component.oprate();
    }

    DecoratorA(Component component){
        this.component = component;
    }
}
