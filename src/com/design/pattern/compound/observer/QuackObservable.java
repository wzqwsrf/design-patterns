package com.design.pattern.compound.observer;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 16:22:11
 * @description: 观察者模式
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
