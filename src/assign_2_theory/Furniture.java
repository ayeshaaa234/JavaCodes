package assign_2_theory;


public class Furniture extends Product{
    String material;
    String nature;
    int dimension;

    public Furniture(int Id, String name, double price, int stQuantity, double tax, String material, String nature, int dimension) {
        super(Id, name, price, stQuantity, tax);
        this.material = material;
        this.nature = nature;
        this.dimension = dimension;
    }



    public String getMaterial() {

        return material;
    }

    public void setMaterial(String material) {

        this.material = material;
    }

    public String getNature() {

        return nature;
    }

    public void setNature(String nature) {

        this.nature = nature;
    }

    public int getDimension() {

        return dimension;
    }

    public void setDimension(int dimension) {

        this.dimension = dimension;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s", material, dimension, nature);

    }
}