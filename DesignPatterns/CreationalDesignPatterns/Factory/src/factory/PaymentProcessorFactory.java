package factory;

import product.INRToUSDPaymentProcessor;
import product.PaymentProcessor;
import product.USDToINRPaymentProcessor;

public class PaymentProcessorFactory {

    public static PaymentProcessor processPayment(String source, String target){
        if(source.equals("USD") && target.equals("INR")){
            return new USDToINRPaymentProcessor();
        }else{
            return new INRToUSDPaymentProcessor();
        }

    }
}
