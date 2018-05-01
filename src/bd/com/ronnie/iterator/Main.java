package bd.com.ronnie.iterator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Menu breakfastMenu = new BreakfastMenu();
        Menu lunchMenu = new LunchMenu();
        Waitress waitress = new Waitress(Arrays.asList(breakfastMenu, lunchMenu));

        waitress.printAllMenuItems();
    }
}
