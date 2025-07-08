package dto;

public class INDPayment extends Payment{
    private String IFSC;

    public INDPayment(String bankName, String accountNumber, double amount, String IFSC){
        super(bankName, accountNumber, amount);
        this.IFSC = IFSC;
    }
    public String getRoutingNumber() {
        return this.IFSC;
    }
}
