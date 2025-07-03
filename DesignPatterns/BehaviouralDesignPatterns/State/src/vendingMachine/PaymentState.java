package vendingMachine;

public class PaymentState implements VendingMachineStates{
    VendingMachineContext vendingMachineContext;

    public PaymentState(VendingMachineContext vendingMachineContext){
        this.vendingMachineContext = vendingMachineContext;
    }
    public void idleState(){

    }
    public void selectProductState(String productCode){

    }
    public void paymentState(double amount){
        if(vendingMachineContext.getSelectedProduct().getCost() > amount){
            System.out.println("You need to pay more ! Please reselect" );
            vendingMachineContext.setState(new PaymentState(vendingMachineContext));
        }else{
            System.out.println("Payment is Successful ! Disbursing the Product !");
            vendingMachineContext.setState(new DisburseProductState(vendingMachineContext));
        }
    }
    public void disburseState(){

    }
}
