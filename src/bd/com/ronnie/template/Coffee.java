package bd.com.ronnie.template;

class Coffee extends BeverageTemplate {

    @Override
    void addIngredient() {
        System.out.println("Adding Coffee as ingredient.");
    }

    @Override
    void addSupplement() {
        System.out.println("Adding Sugar as supplement.");
    }
}
