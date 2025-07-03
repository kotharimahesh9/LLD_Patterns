package vendingMachine;

public class DisburseProductState implements VendingMachineStates{

    VendingMachineContext vendingMachineContext;
    public DisburseProductState(VendingMachineContext vendingMachineContext){
        this.vendingMachineContext = vendingMachineContext;
    }
    public void idleState(){

    }
    public void selectProductState(String productCode){

    }
    public void paymentState(double amount){

    }
    public void disburseState(){
        System.out.println("Product Disbursed !");
        vendingMachineContext.updateInventory();
        vendingMachineContext.setState(new IdleState(vendingMachineContext));
    }
}
