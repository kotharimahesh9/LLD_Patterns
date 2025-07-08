import dto.INDPayment;
import dto.Payment;
import dto.USPayment;
import factory.PaymentProcessorFactory;
import product.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PaymentProcessorFactory.processPayment("INR", "USD");
        Payment ind = new INDPayment("SBI", "2348723345634", 100000, "SBIN0000300");
        Payment usd = new USPayment("PNC", "23874824628", 0, "645238235");
        paymentProcessor.processPayments(ind, usd);

    }
}