package com.design.pattern.singleton;

/**
 * @Author: wangzhenqing
 * @Date: 2015年01月03日22:54:37
 * @Description: 单例模式设计之懒汉式
 */
public class LazySingleton {
    private volatile static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
