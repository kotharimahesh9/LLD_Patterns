package dto;

public class USPayment extends Payment{
    private String routingNumber;

    public USPayment(String bankName, String accountNumber, double amount, String routingNumber){
        super(bankName, accountNumber, amount);
        this.routingNumber = routingNumber;
    }
    public String getRoutingNumber() {
        return routingNumber;
    }

}
