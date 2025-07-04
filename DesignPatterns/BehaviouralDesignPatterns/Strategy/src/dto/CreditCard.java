package dto;

public class CreditCard {
    private final String cardNumber;
    private final int cvv;
    private final String validUntil;
    private double amount;

    public CreditCard(String cardNumber, int cvv, String validUntil){
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.validUntil = validUntil;
        amount = 10000;
    }

    public String getCardNumber(){
        return this.cardNumber;
    }

    public int getCVV(){
        return this.cvv;
    }

    public String getValidUntil(){
        return this.validUntil;
    }

    public void purchase(double amount){
        if(amount > this.amount){
            System.out.println("Sorry Card does not have enough Money ");
        }else{
            this.amount -= amount;
            System.out.println("Transaction processed successfully !");
        }
    }
}
