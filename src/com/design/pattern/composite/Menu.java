package com.design.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: wangzhenqing
 * @date: 2015-08-05 14:49:32
 * @description: 菜单项
 */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents;
    String name;
    String description;

    public Menu(String name, String description) {
        menuComponents = new ArrayList<MenuComponent>();
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print(" " + getName());
        System.out.println(", " + getDescription());
        System.out.println("--------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
