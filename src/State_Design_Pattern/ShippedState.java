package State_Design_Pattern;

public class ShippedState implements OrderState {
    public void proceed(OrderContext context) {
        System.out.println("Order is delivered.");
        context.setState(new DeliveredState());
    }

    public void cancel(OrderContext context) {
        System.out.println("Order already shipped. Cannot cancel now.");
    }
}
