package shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<ProductFactory> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public List<ProductFactory> getItems() {
        return items;
    }

    public void addItem(ProductFactory item) {
        items.add(item);
    }

    public void removeItem(ProductFactory item) {
        items.remove(item);
    }

    public void clearCart() {
        items.clear();
    }
    public void setItems(List<ProductFactory> items) {
        this.items = items;
    }
public double getTotalAmount() {
    double total = 0.0;
    for (ProductFactory item : items) {
        total += item.getPrice();
    }
    return total;
}
}