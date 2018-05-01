package bd.com.ronnie.iterator;

import java.util.Iterator;

class Waitress {

    private BreakfastMenu breakfastMenu;
    private LunchMenu lunchMenu;

    public Waitress(BreakfastMenu breakfastMenu, LunchMenu lunchMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
    }

    @SuppressWarnings("unchecked")
    void printAllMenuItems() {
        Iterator breakfastIterator = breakfastMenu.getIterator();
        breakfastIterator.forEachRemaining(System.out::println);
        Iterator lunchMenuIterator = lunchMenu.getIterator();
        lunchMenuIterator.forEachRemaining(System.out::println);
    }
}
