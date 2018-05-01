package bd.com.ronnie.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class BreakfastMenu implements Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    BreakfastMenu() {
        this.generateMenu();
    }

    private void generateMenu() {
        MenuItem parata = new MenuItem("parata", 15);
        MenuItem rooti = new MenuItem("rooti", 10);
        this.menuItems.addAll(Arrays.asList(parata, rooti));
    }

    @Override
    public Iterator getIterator() {
        return this.menuItems.iterator();
    }
}
