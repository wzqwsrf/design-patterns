package iterator;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 17:56:02
 * @description: Mel的餐厅菜单遍历
 */
public class DinerMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position > menuItems.length
                || menuItems[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }
}
