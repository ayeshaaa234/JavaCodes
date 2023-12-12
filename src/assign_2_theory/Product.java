package assign_2_theory;


public class Product {
    int Id;
    String name;
    double price;
    int stQuantity;
    double tax;

    public Product(int id, String name, double price, int stQuantity, double tax) {
        Id = id;
        this.name = name;
        this.price = price;
        this.stQuantity = stQuantity;
        this.tax = tax;
    }

    public Product() {

    }

    final double getTax() {
        return tax;
    }

    final void setTax(double tax) {
        this.tax = tax;
    }

    final int getId() {
        return Id;
    }

    final void setId(int Id) {
        this.Id = Id;
    }

    final String getName() {

        return name;
    }

    final void setName(String name) {

        this.name = name;
    }

    final double getPrice() {
        return price;
    }

    final void setPrice(double price) {

        this.price = price;
    }

    final int getStQuantity() {

        return stQuantity;
    }

    final void setStQuantity(int stQuantity) {

        this.stQuantity = stQuantity;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Price: %.2f, Stock Quantity: %d, Tax: %.2f",
                Id, name, price, stQuantity, tax);
    }
}