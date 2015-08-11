package com.design.pattern.template;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 14:41:37
 * @description: 测试类 带钩子
 */
public class BeverageTestDriveWithHook {
    public static void main(String[] args) {
        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
