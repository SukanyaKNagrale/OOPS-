package shopping;

public class Purse implements ProductFactory {
    private String productName;
    private double productPrice;
    private String productDescription;
    private int availableQuantity;

    public Purse(String productName, double productPrice, String productDescription, int availableQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String getName() {
        return productName;
    }

    @Override
    public double getPrice() {
        return productPrice;
    }

    @Override
    public String getDescription() {
        return productDescription;
    }

    @Override
    public int getQuantityInStock() {
        return availableQuantity;
    }
}
