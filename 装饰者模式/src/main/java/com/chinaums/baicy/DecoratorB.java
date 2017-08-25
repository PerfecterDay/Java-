package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/8/22.
 */
public class DecoratorB extends Decorator {
    public String getDescription(){
        return "";
    }


    public String oprate(){
        return "DecoratorB "+component.oprate();
    }

    DecoratorB(Component component){
        this.component = component;
    }
}
