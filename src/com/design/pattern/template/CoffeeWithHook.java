package com.design.pattern.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 14:34:34
 * @description: 咖啡 带钩子
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee(y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
