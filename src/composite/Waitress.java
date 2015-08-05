package composite;

import iterator.*;
import iterator.Menu;
import iterator.MenuItem;

/**
 * @author: wangzhenqing
 * @date: 2015-08-05 14:55:30
 * @description: 侍者
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
