package State_Design_Pattern;

public class NewOrderState implements OrderState {
    public void proceed(OrderContext context) {
        System.out.println("Order is packed.");
        context.setState(new PackedState());
    }

    public void cancel(OrderContext context) {
        System.out.println("Order is cancelled from New state.");
        context.setState(null);
    }
}
