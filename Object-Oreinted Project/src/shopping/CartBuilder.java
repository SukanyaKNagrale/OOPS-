package shopping;

import java.util.ArrayList;
import java.util.List;

public class CartBuilder {
    private List<ProductFactory> items;

    public CartBuilder() {
        this.items = new ArrayList<>();
    }

    public CartBuilder addItem(ProductFactory product) {
        items.add(product);
        return this;
    }

    public ShoppingCart build() {
        ShoppingCart cart = new ShoppingCart();
        cart.setItems(new ArrayList<>(items)); 
        return cart;
    }
}
