package shopping;

public class Clothing extends Item {
    int size;
    public Clothing(int size,int productId, int productPrice,String productName)
    {
        super(productId, productPrice, productName);
        this.size=size;
    }
    
    public String getDetails()
    {
        return "Electronics - " + productName + " (Size: " + size + " years, Price: $" +  productPrice + ")";
    }
}
