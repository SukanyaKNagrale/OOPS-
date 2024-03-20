package shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class ShoppingCartTest {

    @Test
    public void testGetTotalAmount() {
        List<ProductFactory> products = ProductLoader.loadProducts();
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(products.get(0)); 
        cart.addItem(products.get(1)); 
        cart.addItem(products.get(6)); 
        cart.addItem(products.get(9)); 

        double expectedTotalAmount = products.get(0).getPrice() + products.get(1).getPrice()
                                     + products.get(6).getPrice() + products.get(9).getPrice();
        assertEquals(expectedTotalAmount, cart.getTotalAmount(), 0.01);
    }

    @Test
    public void testAddItem() {
        List<ProductFactory> products = ProductLoader.loadProducts();
        ShoppingCart cart = new ShoppingCart();
        ProductFactory product = products.get(2); 

        cart.addItem(product);
        assertEquals(1, cart.getItems().size());
        assertEquals(product, cart.getItems().get(0));
    }

    @Test
    public void testRemoveItem() {
        List<ProductFactory> products = ProductLoader.loadProducts();
        ShoppingCart cart = new ShoppingCart();
        ProductFactory product = products.get(3); 

        cart.addItem(product);
        cart.removeItem(product);
        assertEquals(0, cart.getItems().size());
    }
}
