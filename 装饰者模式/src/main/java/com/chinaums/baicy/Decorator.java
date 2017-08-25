package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/8/22.
 */
public abstract  class Decorator implements Component{
    Component component;
    public abstract String getDescription();
}
