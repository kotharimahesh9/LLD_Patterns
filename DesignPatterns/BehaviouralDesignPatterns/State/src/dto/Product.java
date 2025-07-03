package dto;

public class Product {
    private String productName;
    private String productId;
    private double cost;

    public Product(String productName, String productId, double cost){
        this.productName = productName;
        this.productId = productId;
        this.cost = cost;
    }

    public String getProductName(){
        return this.productName;
    }

    public String getProductId(){
        return this.productId;
    }

    public double getCost(){
        return this.cost;
    }
}
