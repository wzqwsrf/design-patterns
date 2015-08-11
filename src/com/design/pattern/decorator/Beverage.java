package com.design.pattern.decorator;

/**
 * @author: wangzhenqing
 * @date: 2015-07-24 15:21:13
 * @description: 基类
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
