package com.design.pattern.iterator;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 18:03:42
 * @description: 侍者
 */
public class Waitress {
    Menu panCakeHouseMenu;
    Menu dinerMenu;

    public Waitress(PanCakeHouseMenu panCakeHouseMenu, DinerMenu dinerMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = panCakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("Menu\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
