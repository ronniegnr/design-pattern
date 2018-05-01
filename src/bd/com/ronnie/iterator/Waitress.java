package bd.com.ronnie.iterator;

import java.util.Iterator;
import java.util.List;

class Waitress {

    private List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    @SuppressWarnings("unchecked")
    void printAllMenuItems() {
        for (Menu menu : menus) {
            Iterator iterator = menu.getIterator();
            iterator.forEachRemaining(System.out::println);
        }
    }
}
