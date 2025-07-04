package strategy;

import java.util.HashMap;
import java.util.Map;

public class InternetBankingStrategy implements PaymentStrategy{
    private static Map<String, String> DATABASE = new HashMap<>();
    private String email;
    private String password;
    private boolean isSignedIn;

    static {
        DATABASE.put("kotharimahesh9@gmail.com", "qwerty");

    }

    public boolean pay(double amount){
        return true;
    }

    public void collectInformation(){
        // add in the details for internet banking
    }
}
