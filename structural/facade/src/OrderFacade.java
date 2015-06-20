public class OrderFacade {
    private Inventory inventory;
    private Payment payment;

    public OrderFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
    }

    public void placeOrder() {
        inventory.checkInventory();
        payment.deductPayment();
    }
}
