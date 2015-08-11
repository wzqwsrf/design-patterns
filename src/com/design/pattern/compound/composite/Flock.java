package com.design.pattern.compound.composite;

import com.design.pattern.compound.ducks.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 15:35:24
 * @description: 组合模式
 */
public class Flock implements Quackable{

    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
}
