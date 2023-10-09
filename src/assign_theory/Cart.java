package assign_theory;


class Cart {
    private int[] quantities = new int[3];

    public void addToCart(Item item, int quantity) {
        switch(item) {
            case BOOK:
                quantities[0] += quantity;
                break;
            case PENCIL:
                quantities[1] += quantity;
                break;
            case LUNCHBOX:
                quantities[2] += quantity;
                break;
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < quantities.length; i++) {
            total += Store.getPrice(Item.values()[i]) * quantities[i];
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("Receipt:");
        for (int i = 0; i < quantities.length; i++) {
            int quantity = quantities[i];
            if (quantity > 0) {
                System.out.println(Item.values()[i] + " x" + quantity + " : $" + Store.getPrice(Item.values()[i]) * quantity);
            }
        }
        System.out.println("Total: $" + calculateTotal());
    }
}