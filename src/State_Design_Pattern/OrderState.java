package State_Design_Pattern;

public interface OrderState {
    void proceed(OrderContext context);
    void cancel(OrderContext context);
}
