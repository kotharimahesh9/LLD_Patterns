package vendingMachine;

public interface VendingMachineStates {

    public void idleState();
    public void selectProductState(String productCode);
    public void paymentState(double amount);
    public void disburseState();
}
