package State_Design_Pattern;

public class DeliveredState implements OrderState {
    public void proceed(OrderContext context) {
        System.out.println("Order already delivered. No further action.");
    }

    public void cancel(OrderContext context) {
        System.out.println("Order already delivered. Cannot cancel.");
    }
}


