public class PizzaDriver {
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder("Маргарита", "Мира 11", false, Size.MEDIUM);
        order.order();
        order.order();
        order.cancel();
        order.cancel();
    }
}
