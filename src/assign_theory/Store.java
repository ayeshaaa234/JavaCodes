package assign_theory;

class Store {

    private int quantity;
    private static final double[] prices = {500.0, 10.0, 650.0};
    private static int[] stock = {50, 100, 30};

    public static double getPrice(Item item) {
        switch(item) {
            case BOOK:
                return prices[0];
            case PENCIL:
                return prices[1];
            case LUNCHBOX:
                return prices[2];
            default:
                return 0.0;
        }
    }
    public static int getStock(Item item) {
        switch(item) {
            case BOOK:
                return stock[0];
            case PENCIL:
                return stock[1];
            case LUNCHBOX:
                return stock[2];
            default:
                return 0;
        }
    }

    public static void reduceStock(Item item, int quantity) {
        switch(item) {
            case BOOK:
                stock[0] -= quantity;
                break;
            case PENCIL:
                stock[1] -= quantity;
                break;
            case LUNCHBOX:
                stock[2] -= quantity;
                break;
        }
    }
}

