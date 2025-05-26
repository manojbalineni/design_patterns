package State_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.proceed(); // New -> Packed
        order.proceed(); // Packed -> Shipped
        order.cancel();  // Cancel not allowed in Shipped state
        order.proceed(); // Shipped -> Delivered
        order.cancel();  // Cancel not allowed in Delivered state
    }
}
