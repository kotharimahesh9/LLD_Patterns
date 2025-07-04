package strategy;

public interface PaymentStrategy {

    public boolean pay(double amount);
    public void collectInformation();
}
