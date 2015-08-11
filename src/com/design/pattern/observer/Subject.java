package com.design.pattern.observer;

/**
 * @author: wangzhenqing
 * @date: 2015-07-22 16:00:43
 * @description: 主题
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
