package strategy;

import dto.CreditCard;

public class CreditCardPayment implements PaymentStrategy{
    CreditCard creditCard;
    public boolean pay(double amount){
        collectInformation();
        System.out.println("Paying by credit card !");
        creditCard.purchase(amount);
        return true;
    }

    public void collectInformation(){
        // dummy information
        creditCard = new CreditCard("1234 5678 9012 3456", 324, "08/2035");

    }
}
