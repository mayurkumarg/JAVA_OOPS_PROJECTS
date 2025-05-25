package shopping;

public class Cart {
    Product product;

    public void addProduct(Product product) throws InvalidProductException,ProductNotAvailableException
    {
        if(product==null)
        {
            throw new InvalidProductException("The Entered product is not valid: !!");
        }
        this.product=product;
    }

    public void displayCart() {
        if (product == null) {
            System.out.println("Cart is empty.");
        } else {
            product.printDetails();
            System.out.println("Total Price: $" + product.getPrice());
        }
    }
}
