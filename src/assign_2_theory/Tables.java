package assign_2_theory;

public class Tables extends Furniture{

    String shape;
    double dimensions;

    public Tables(int Id, String name, double price, int stQuantity, double tax, String material, String nature, int dimension, String shape) {
        super(Id, name, price, stQuantity, tax, material, nature, dimension);
        this.shape = shape;
    }

    public String getShape() {

        return shape;
    }

    public void setShape(String shape) {

        this.shape = shape;
    }

    public double getDimensions() {

        return dimensions;
    }

    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }


    @Override
    public String toString() {
        return "Tables{" +
                ", Id=" + Id +
                "shape='" + shape + '\'' +
                ", dimensions=" + dimensions +
                ", material='" + material + '\'' +
                ", nature='" + nature + '\'' +
                ", dimension=" + dimension +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stQuantity=" + stQuantity +
                ", tax=" + tax +
                "} " + super.toString();
    }
}