package product;

import dto.Payment;

public interface PaymentProcessor {
    public boolean processPayments(Payment from, Payment to);
}
