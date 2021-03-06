package com.design.pattern.iterator;

import java.util.ArrayList;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 17:29:57
 * @description: 煎饼屋菜单实现
 */
public class PanCakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PanCakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                         boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description,
                                            vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator(){
        return new PanCakeHouseMenuIterator(menuItems);
    }
}
