package assign_2_theory;

public class Seating extends Furniture{
    double dimensions;
    double loadCapacity;
    String material;

    public Seating(int Id, String name, double price, int stQuantity, double tax, String material, String nature, int dimension, double loadCapacity, String material1) {
        super(Id, name, price, stQuantity, tax, material, nature, dimension);
        this.loadCapacity = loadCapacity;
        this.material = material1;
    }

    public double getDimensions() {
        return dimensions;
    }

    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return String.format("Seating - %s, Dimensions: %.2f, Load Capacity: %.2f, Material: %s",
                super.toString(), dimensions, loadCapacity, material);
    }
}
