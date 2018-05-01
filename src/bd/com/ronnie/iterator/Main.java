package bd.com.ronnie.iterator;

public class Main {

    public static void main(String[] args) {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        LunchMenu lunchMenu = new LunchMenu();
        Waitress waitress = new Waitress(breakfastMenu, lunchMenu);

        waitress.printAllMenuItems();
    }
}
