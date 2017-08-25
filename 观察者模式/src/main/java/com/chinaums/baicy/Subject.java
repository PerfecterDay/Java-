package com.chinaums.baicy;

/**
 * Created by BaIcy on 2017/5/19.
 */
public interface Subject {
    void register(Observer o);
    void unRegister(Observer o);

    void notifyObserver();
}
