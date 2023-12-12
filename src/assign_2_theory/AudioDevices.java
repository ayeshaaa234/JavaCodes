package assign_2_theory;

public class AudioDevices extends Electronics{

    String type;
    String role;

    public AudioDevices(int Id, String name, double price, int stQuantity, double tax, double powerCons, int warranty, String type, String role) {
        super(Id, name, price, stQuantity, tax, powerCons, warranty);
        this.type = type;
        this.role = role;
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

    public String getType() {
        return type;
    }

    final void setType() {
        this.type = "Headphones";
    }

    public String getRole() {
        return role;
    }

    final void setRole() {
        this.role = "Listening";
    }

    @Override
    public String toString() {
        return "AudioDevices{" +
                ", Id=" + Id +
                "type='" + type + '\'' +
                ", role='" + role + '\'' +
                ", powerCons=" + powerCons +
                ", warranty=" + warranty +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stQuantity=" + stQuantity +
                ", tax=" + tax +
                "} " + super.toString();
    }
}