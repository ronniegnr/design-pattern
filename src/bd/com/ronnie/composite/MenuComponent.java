package bd.com.ronnie.composite;

import java.util.ArrayList;

abstract class MenuComponent {

    private String name;
    private String url;

    ArrayList<MenuComponent> menuComponents = new ArrayList<>();

    MenuComponent(String name, String url) {
        this.name = name;
        this.url = url;
    }

    MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @SuppressWarnings("unchecked")
    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ")
            .append(url)
            .append("\n");
        return builder.toString();
    }
}
