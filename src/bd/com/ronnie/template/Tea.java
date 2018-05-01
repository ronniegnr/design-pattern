package bd.com.ronnie.template;

class Tea extends BeverageTemplate {

    @Override
    void addIngredient() {
        System.out.println("Adding Tea as ingredient.");
    }

    @Override
    void addSupplement() {
        System.out.println("Adding Salt as supplement.");
    }
}
