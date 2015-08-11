package com.design.pattern.template;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 11:22:32
 * @description: 抽象基类
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void brew();

    public abstract void addCondiments();
}
