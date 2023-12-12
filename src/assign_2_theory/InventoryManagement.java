package assign_2_theory;

public class InventoryManagement {
    Product[] products;
    int productCount;

    public InventoryManagement(int maxSize) {
        this.products = new Product[maxSize];
        this.productCount = 0;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Product cannot be added");
        }
    }

//    public Product searchById(int prID) {
//        for (int i = 0; i < productCount; i++) {
//            if (products[i].getId() == prID) {
//                return products[i];
//            }
//        }
//        return null;
//    }

    public Product search(String Name) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equals(Name)) {
                return products[i];
            }
        }
        return null;
    }

    public void removeProduct(int productId) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId() == productId) {
                for (int j = i; j < productCount - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[productCount - 1] = null;
                productCount--;
                return;
            }
        }
    }

    public void generateStockReport() {
        System.out.println("Stock Report:");
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i].toString());
        }
    }

    public void updatePrice(int productId, double newPrice) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId() == productId) {
                products[i].setPrice(newPrice);
                return;
            }
        }
    }
}
