package State_Design_Pattern;

public class OrderContext {
    private OrderState currentState;

    public OrderContext() {
        currentState = new NewOrderState(); // Initial state
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void proceed() {
        if (currentState != null)
            currentState.proceed(this);
        else
            System.out.println("No further actions possible.");
    }

    public void cancel() {
        if (currentState != null)
            currentState.cancel(this);
        else
            System.out.println("No further actions possible.");
    }
}
