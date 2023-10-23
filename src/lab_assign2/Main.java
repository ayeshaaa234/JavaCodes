package lab_assign2;

import java.util.*;

// Define a class for the foundational blueprint of a product
class Product {
    private String name;
    private double price;
    private int stockQuantity;
    private String uniqueID;
    // Add getters and setters for these attributes

    // Constructor
    public Product(String name, double price, int stockQuantity, String uniqueID) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.uniqueID = uniqueID;
    }
}

// Define a class for electronic products (extends Product)
class ElectronicProduct extends Product {
    private String powerConsumption;
    private String warranty;
    // Add getters and setters for these attributes

    // Constructor
    public ElectronicProduct(String name, double price, int stockQuantity, String uniqueID,
                             String powerConsumption, String warranty) {
        super(name, price, stockQuantity, uniqueID);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }
}

// Define a class for furniture products (extends Product)
class FurnitureProduct extends Product {
    private String material;
    private String dimensions;
    // Add getters and setters for these attributes

    // Constructor
    public FurnitureProduct(String name, double price, int stockQuantity, String uniqueID,
                            String material, String dimensions) {
        super(name, price, stockQuantity, uniqueID);
        this.material = material;
        this.dimensions = dimensions;
    }
}

// Define a class for grocery products (extends Product)
class GroceryProduct extends Product {
    private Date expirationDate;
    private String nutritionalValues;
    // Add getters and setters for these attributes

    // Constructor
    public GroceryProduct(String name, double price, int stockQuantity, String uniqueID,
                          Date expirationDate, String nutritionalValues) {
        super(name, price, stockQuantity, uniqueID);
        this.expirationDate = expirationDate;
        this.nutritionalValues = nutritionalValues;
    }
}

// Define a class for managing the inventory
class InventoryManager {
    private List<Product> products = new ArrayList<>();

    // Add methods to add, update, search, and remove products from the inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(String uniqueID, double newPrice, int newStockQuantity) {
        for (Product product : products) {
            if (product.getUniqueID().equals(uniqueID)) {
                product.setPrice(newPrice);
                product.setStockQuantity(newStockQuantity);
                break;
            }
        }
    }

    public Product searchProduct(String uniqueID) {
        for (Product product : products) {
            if (product.getUniqueID().equals(uniqueID)) {
                return product;
            }
        }
        return null;
    }

    public void removeProduct(String uniqueID) {
        products.removeIf(product -> product.getUniqueID().equals(uniqueID));
    }

    // Add additional methods for reporting capabilities
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        ElectronicProduct phone = new ElectronicProduct("Smartphone", 699.99, 50, "E123",
                "10W", "1 year warranty");

        FurnitureProduct chair = new FurnitureProduct("Office Chair", 199.99, 20, "F456",
                "Leather", "25x25x40 inches");

        GroceryProduct apple = new GroceryProduct("Apple", 1.49, 100, "G789",
                new Date(2023 - 1900, 10, 23), "100g, 52 kcal");

        InventoryManager manager = new InventoryManager();
        manager.addProduct(phone);
        manager.addProduct(chair);
        manager.addProduct(apple);

        // Update product details
        manager.updateProduct("E123", 749.99, 30);

        // Search for a product
        Product searchedProduct = manager.searchProduct("F456");
        if (searchedProduct != null) {
            System.out.println("Found: " + searchedProduct.getName());
        } else {
            System.out.println("Product not found.");
        }

        // Remove a product
        manager.removeProduct("G789");
    }
}

