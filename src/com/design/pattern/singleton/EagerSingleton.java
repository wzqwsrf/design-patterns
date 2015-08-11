package com.design.pattern.singleton;

/**
 * @Author: wangzhenqing
 * @Date: 2015年01月03日22:51:23
 * @Description: 单例设计模式之饿汉式
 */
public class EagerSingleton {
    private static final EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }

}
