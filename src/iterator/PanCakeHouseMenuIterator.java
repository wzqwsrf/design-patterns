package iterator;

import java.util.ArrayList;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 18:00:08
 * @description: 煎饼屋菜单遍历
 */
public class PanCakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PanCakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
