
package application;

import shopping.*;

public class OnlineShoppingApp {
    public static void main(String[] args) {
        try {
            Cart cart = new Cart();
            Product laptop = new Electronics("fastrack",001,100,"watch");
            Product tshirt = new Clothing(34,002,2000,"tshirt");
            cart.addProduct(laptop);
            System.out.println("\nShopping Cart:");
            cart.displayCart();

            cart.addProduct(tshirt);
            System.out.println("\nShopping Cart:");
            cart.displayCart();
        } catch (ProductNotAvailableException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
            