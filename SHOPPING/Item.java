package shopping;

public abstract class Item implements Product {
    int productId, productPrice;
    String productName;

    public Item(int productId, int productPrice,String productName)
    {
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }

    public int getPrice()
    {
        return productPrice;
    }

    public void printDetails()
    {
        System.out.println(getDetails());
    }
}

