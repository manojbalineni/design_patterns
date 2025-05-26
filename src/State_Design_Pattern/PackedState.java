package State_Design_Pattern;

public class PackedState implements OrderState {
    public void proceed(OrderContext context) {
        System.out.println("Order is shipped.");
        context.setState(new ShippedState());
    }

    public void cancel(OrderContext context) {
        System.out.println("Order is cancelled from Packed state.");
        context.setState(null);
    }
}
