package bd.com.ronnie.template;

abstract class BeverageTemplate {

    final void prepareBeverage() {
        pourWater();
        addIngredient();
        pourToCup();
        addSupplement();
    }

    private void pourWater() {
        System.out.println("Pouring water.");
    }

    abstract void addIngredient();

    private void pourToCup() {
        System.out.println("Pouring to cup.");
    }

    abstract void addSupplement();
}
