package assign_2_theory;

public class Main {

    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement(20);

        Product product1 = new Product(1, "Product 1", 19.99, 50, 2.5);
        inventory.addProduct(product1);

        Product product2 = new Product(2, "Product 2", 29.99, 30, 3.0);
        inventory.addProduct(product2);

        Product grocery1 = new Grocery(3,"Grocery",400,5,2,"2023-01-23","500kcal","2026-04-12");
        inventory.addProduct(grocery1);

        Tables table1 = new Tables(4,"table",40000,2,34.6,"wood","hollow",34,"rectangle");
        inventory.addProduct(table1);

        AudioDevices audioDevice1 = new AudioDevices(5,"AudioDevice",2000,4,245.0,240,2,"holder","Music");
        inventory.addProduct(audioDevice1);




        System.out.println("Stock Report Before Modifications:");
        inventory.generateStockReport();

        inventory.removeProduct(5);

        System.out.println("\nStock Report After Removing Product 5:");
        inventory.generateStockReport();

        inventory.updatePrice(2, 34.99);

        System.out.println("\nStock Report After Updating Price of Product 2:");
        inventory.generateStockReport();
        System.out.println("\nwhen we search something\n");
        System.out.println (inventory.search(grocery1.getName()));
    }
}
