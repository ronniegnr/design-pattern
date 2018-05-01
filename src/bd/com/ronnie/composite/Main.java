package bd.com.ronnie.composite;

public class Main {

    public static void main(String[] args) {
        MenuComponent mainMenu = new Menu("Main Menu", "mainmenu.com");
        MenuComponent firstMenu = new Menu("First Menu", "firstmenu.com");
        MenuComponent secondMenu = new Menu("Second Menu", "secondmenu.com");
        MenuComponent firstMenuSubMenu = new MenuItem("First Menu Sub Menu", "firstmenusubmenu.com");

        mainMenu.add(firstMenu);
        mainMenu.add(secondMenu);
        secondMenu.add(firstMenuSubMenu);

        System.out.println(mainMenu.toString());
    }
}
