package product;

import dto.Payment;

public class INRToUSDPaymentProcessor implements PaymentProcessor{

    public boolean processPayments(Payment from, Payment to){
        double inrAmount = from.getAmount();
        double conversionRate = (1/85.0);
        double usdAmount = inrAmount * conversionRate;

        System.out.println("Payment Successful to : " + to.getBankName() + " added " + usdAmount);

        return false;
    }
}
