package assign_theory;

import java.util.Scanner;

public class CashierSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        for (Item item : Item.values()) {
            System.out.println("\nAvailable Items:");
            System.out.println(item + " - Price: $" + Store.getPrice(item) + ", Stock: " + Store.getStock(item));

            System.out.println("\nEnter quantity of " + item + " (or enter 0 to skip):");
            int quantity = scanner.nextInt();

            if (quantity < 0) {
                System.out.println("Invalid quantity. Please enter a positive number.");
                continue;
            } else if (quantity > Store.getStock(item)) {
                System.out.println("Not enough stock available.");
                continue;
            }

            cart.addToCart(item, quantity);
            Store.reduceStock(item, quantity);
            System.out.println("Remaining Stock for " + item + ": " + Store.getStock(item));
        }

        cart.printReceipt();


    }


}

