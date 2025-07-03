package dto;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<String, Product> productMap;
    Map<String, Integer> inventoryMap;

    public Inventory(){
        productMap = new HashMap<>();
        inventoryMap = new HashMap<>();
    }

    public void initializeInventory(){
        productMap.put("coke", new Product("Regular COKE","coke", 2.29));
        productMap.put("dietCoke", new Product("Diet COKE","dietCoke", 3.29));
        productMap.put("dr", new Product("DR Pepper","dr", 2.29));

        inventoryMap.put("coke", 5);
        inventoryMap.put("dietCoke", 5);
        inventoryMap.put("dr", 5);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(String key: productMap.keySet()){
            sb.append(productMap.get(key).getProductName() + " " + inventoryMap.get(key));
            sb.append("\n");
        }

        return sb.toString();
    }

    public boolean checkIfAvailable(String productCode){
        if(!productMap.containsKey(productCode)){
            return false;
        }

        if(inventoryMap.get(productCode) <= 0)
            return false;
        return true;
    }

    public Product getItem(String productCode){
        return productMap.get(productCode);
    }

    public Map<String, Integer> getInventoryMap(){
        return this.inventoryMap;
    }

    public void updateInventory(String productId){
        int quantity = inventoryMap.get(productId);
        if(quantity - 1 >= 1){
            inventoryMap.put(productId, quantity - 1);
        }else{
            inventoryMap.remove(productId);
        }
    }
}
