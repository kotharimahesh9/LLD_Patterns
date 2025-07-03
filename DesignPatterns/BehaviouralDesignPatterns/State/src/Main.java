import vendingMachine.VendingMachineContext;

public class Main {
    public static void main(String[] args) {
        VendingMachineContext vendingMachine = new VendingMachineContext();

        vendingMachine.initializeContext();
        vendingMachine.selectProductState("coke");
        vendingMachine.paymentState(2.39);
        vendingMachine.disburseState();
    }
}