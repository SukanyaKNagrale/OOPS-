package shopping;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CatalogTest {
    @Test
    public void testAddProduct() {
        Catalog catalog = new Catalog();
        ProductFactory laptop = new Kitchen("Laptop", 1200.0, "High-performance laptop", 10);
        catalog.addProduct(laptop);
        assertEquals(1, catalog.getAllProducts().size());
        assertEquals(laptop, catalog.getProductByName("Laptop"));
    }

    @Test
    public void testAddProducts() {
        Catalog catalog = new Catalog();
        List<ProductFactory> newProducts = new ArrayList<>();
        ProductFactory tShirt = new HomeGoods("T-Shirt", 25.0, "Comfortable cotton T-shirt", 50);
        newProducts.add(tShirt);
        catalog.addProducts(newProducts);
        assertEquals(1, catalog.getAllProducts().size());
        assertEquals(tShirt, catalog.getProductByName("T-Shirt"));
    }

    @Test
    public void testGetProductByName() {
        Catalog catalog = new Catalog();
        ProductFactory laptop = new Kitchen("Laptop", 1200.0, "High-performance laptop", 10);
        catalog.addProduct(laptop);
        assertEquals(laptop, catalog.getProductByName("Laptop"));
        assertNull(catalog.getProductByName("NonexistentProduct"));
    }
}
