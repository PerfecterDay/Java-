package com.chinaums.baicy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BaIcy on 2017/5/19.
 */
public class ASubject implements Subject {

    List<Observer> observers = new ArrayList<Observer>();

    int x,y;


    public void register(Observer o){
        observers.add(o);
    }

    public void unRegister(Observer o){
        int i = observers.indexOf(o);
        if (-1 != i){
            observers.remove(o);
        }
    }

    public void notifyObserver(){
        for (Observer observer : observers) {
            observer.update(x,y);
        }
    }


    public void setX(int x) {
        this.x = x;
        notifyObserver();
    }

    public void setY(int y){
        this.y = y;
        notifyObserver();
    }
}
