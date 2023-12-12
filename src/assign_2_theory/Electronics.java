package assign_2_theory;

public class Electronics extends Product {


    double powerCons;
    int warranty;

    public Electronics(int Id, String name, double price, int stQuantity, double tax, double powerCons, int warranty) {
        super(Id, name, price, stQuantity, tax);
        this.powerCons = powerCons;
        this.warranty = warranty;
    }



    public double getPowerCons() {

        return powerCons;
    }

    public void setPowerCons(double powerCons) {

        this.powerCons = powerCons;
    }

    public int getWarranty() {

        return warranty;
    }

    public void setWarranty(int warranty) {

        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return String.format("%.2f %d", powerCons, warranty);


    }


}