package vendingMachine;

public class IdleState implements VendingMachineStates{

    VendingMachineContext vendingMachineContext;

    public IdleState(VendingMachineContext vendingMachineContext){
        this.vendingMachineContext = vendingMachineContext;
    }
    public void idleState(){
        System.out.println(" AVAILABLE INVENTORY ");
        System.out.println(vendingMachineContext);
        vendingMachineContext.setState(new ProductSelectionState(vendingMachineContext));
    }
    public void selectProductState(String productCode){

    }
    public void paymentState(double amount){

    }
    public void disburseState(){

    }
}
