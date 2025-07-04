import strategy.CreditCardPayment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(new CreditCardPayment());
        if(payment.pay(5000)){
            System.out.println("Payment is Successful !");
        }else{
            System.out.println("Payment Failed !");
        }
    }
}