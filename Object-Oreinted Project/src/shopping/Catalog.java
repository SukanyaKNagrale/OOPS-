package shopping;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<ProductFactory> products = new ArrayList<>();

    public void addProduct(ProductFactory product) {
        products.add(product);
    }

    public ProductFactory getProductByName(String name) {
        for (ProductFactory product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public List<ProductFactory> getAllProducts() {
        return new ArrayList<>(products); 
    }

    public void addProducts(List<ProductFactory> newProducts) {
        products.addAll(newProducts);
    }
}
