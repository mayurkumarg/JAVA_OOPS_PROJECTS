package shopping;

public class Electronics extends Item {
    String brand;
    public Electronics(String brand,int productId, int productPrice,String productName)
    {
        super(productId, productPrice, productName);
        this.brand=brand;
    }
    
    public String getDetails()
    {
        return "Electronics - " + productName + " (Brand: " + brand + " years, Price: $" +  productPrice + ")";
    }
}
