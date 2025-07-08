package product;

import dto.Payment;

public class USDToINRPaymentProcessor implements PaymentProcessor{

    @Override
    public boolean processPayments(Payment from, Payment to) {
        double usdAmount = from.getAmount();
        double conversionRate = 85;
        double inrAmount = usdAmount * conversionRate;

        System.out.println("Payment Successful to : " + to.getBankName() + " added " + inrAmount);

        return true;
    }
}
