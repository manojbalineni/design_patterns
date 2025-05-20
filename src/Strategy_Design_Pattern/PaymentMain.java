package Strategy_Design_Pattern;

public class PaymentMain {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new CreditCardPayment("4851581762"));
        paymentContext.payAmount(100);

        paymentContext.setPaymentStrategy(new PaypalPayment("balinenimanojsai@gmail.com"));
        paymentContext.payAmount(1200);

        
    }
}
