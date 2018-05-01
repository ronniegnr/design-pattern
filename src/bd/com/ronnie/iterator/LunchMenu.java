package bd.com.ronnie.iterator;

import java.util.Iterator;

public class LunchMenu implements Menu {

    private static final int MAX_MENU_LENGTH = 5;
    private MenuItem[] menuItems = new MenuItem[MAX_MENU_LENGTH];

    public LunchMenu() {
        this.generateMenu();
    }

    private void generateMenu() {
        MenuItem biriani = new MenuItem("biriani", 15);
        MenuItem tehari = new MenuItem("tehari", 10);
        menuItems[0] = biriani;
        menuItems[1] = tehari;
    }

    @Override
    public Iterator getIterator() {
        return new LunchMenuIterator(menuItems);
    }
}
