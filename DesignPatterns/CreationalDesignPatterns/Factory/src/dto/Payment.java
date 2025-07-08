package dto;

public abstract class Payment {

    protected double amount;
    protected String bankName;
    protected String accountNumber;

    public Payment(String bankName, String accountNumber, double amount){
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


}
