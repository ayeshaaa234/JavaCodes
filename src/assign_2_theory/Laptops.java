package assign_2_theory;

public class Laptops extends Electronics {

    String processorType;
    int RAMSize;
    int dimensions;

    public Laptops(int Id, String name, double price, int stQuantity, double tax, double powerCons, int warranty, String processorType, int RAMSize, int dimensions) {
        super(Id, name, price, stQuantity, tax, powerCons, warranty);
        this.processorType = processorType;
        this.RAMSize = RAMSize;
        this.dimensions = dimensions;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String s) {
        this.processorType = processorType;
    }

    public int getRAMSize() {
        return RAMSize;
    }

    public void setRAMSize(String s) {
        this.RAMSize = RAMSize;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(String s) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return String.format("Laptop - %s, Processor: %s, RAM: %d GB, Dimensions: %d in",
                super.toString(), processorType, RAMSize, dimensions);
    }
}
