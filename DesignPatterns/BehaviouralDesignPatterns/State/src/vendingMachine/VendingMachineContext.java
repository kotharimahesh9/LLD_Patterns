package vendingMachine;

import dto.Inventory;
import dto.Product;

public class VendingMachineContext {
    private VendingMachineStates vendingMachineStates;

    private Inventory inventory;
    private Product selectedProduct;

    public VendingMachineContext(){
        inventory = new Inventory();
        inventory.initializeInventory();
    }

    public void initializeContext(){
        this.vendingMachineStates = new IdleState(this);
        vendingMachineStates.idleState();
    }

    public void setState(VendingMachineStates vendingMachineState){
        this.vendingMachineStates = vendingMachineState;
    }


    public Inventory getInventory(){
        return this.inventory;
    }

    public void setSelectedProduct(Product product){
        this.selectedProduct = product;
    }

    public Product getSelectedProduct(){
        return this.selectedProduct;
    }

    public void updateInventory(){
        inventory.updateInventory(selectedProduct.getProductId());
    }


    public void selectProductState(String productCode){
        vendingMachineStates.selectProductState(productCode);
    }

    public void paymentState(double amount){
        vendingMachineStates.paymentState(amount);
    }

    public void disburseState(){
        vendingMachineStates.disburseState();
    }
}
