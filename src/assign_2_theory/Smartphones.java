package assign_2_theory;

public class Smartphones extends Electronics {
    String operatingSystem;
    int storageCapacity;
    int camResolution;

    public Smartphones(int Id, String name, double price, int stQuantity, double tax, double powerCons, int warranty, String operatingSystem, int storageCapacity, int camResolution) {
        super(Id, name, price, stQuantity, tax, powerCons, warranty);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.camResolution = camResolution;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String apple) {
        this.operatingSystem = operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String s) {
        this.storageCapacity = storageCapacity;
    }

    public int getCamResolution() {
        return camResolution;
    }

    public void setCamResolution(int camResolution) {
        this.camResolution = camResolution;
    }

    @Override
    public String toString() {
        return String.format("Smartphone - %s, OS: %s, Storage: %d GB, Camera: %d MP",
                super.toString(), operatingSystem, storageCapacity, camResolution);
    }
}