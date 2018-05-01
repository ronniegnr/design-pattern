package bd.com.ronnie.iterator;

import java.util.Iterator;

public class LunchMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position = 0;
    private int menuItemsLength;

    LunchMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        this.menuItemsLength = menuItems.length;
    }

    @Override
    public boolean hasNext() {
        return (menuItemsLength > position) && (null != menuItems[position]);
    }

    @Override
    public Object next() {
        return menuItems[position++];
    }
}
