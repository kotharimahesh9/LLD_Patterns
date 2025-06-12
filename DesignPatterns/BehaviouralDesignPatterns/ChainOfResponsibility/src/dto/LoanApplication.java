package dto;

public abstract class LoanApplication {

    private String accountNumber;
    private double loanAmount;
    protected String lendingBank;
    private double cibilScore;


    public abstract void setLendingBank(String lendingBank);

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLendingBank() {
        return lendingBank;
    }

    public double getCibilScore() {
        return cibilScore;
    }

    public void setCibilScore(double cibilScore) {
        this.cibilScore = cibilScore;
    }
}
