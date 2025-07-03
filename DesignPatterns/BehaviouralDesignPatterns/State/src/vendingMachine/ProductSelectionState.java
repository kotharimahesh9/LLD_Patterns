package vendingMachine;

public class ProductSelectionState implements VendingMachineStates {
    VendingMachineContext vendingMachineContext;

    public ProductSelectionState(VendingMachineContext vendingMachineContext){
        this.vendingMachineContext = vendingMachineContext;
    }
    public void idleState(){
        System.out.println("In product Selection stage");
    }
    public void selectProductState(String productCode){
        if(vendingMachineContext.getInventory().checkIfAvailable(productCode)){
            vendingMachineContext.setSelectedProduct(vendingMachineContext.getInventory().getItem(productCode));
            System.out.println("Product Selected Successfully");
            vendingMachineContext.setState(new PaymentState(vendingMachineContext));
        }else{
            System.out.println("Item Not Available ! ");
        }
    }
    public void paymentState(double amount){
        System.out.println("Please select the product before making payment");
    }
    public void disburseState(){

    }
}
