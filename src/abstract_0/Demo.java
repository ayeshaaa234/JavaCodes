package abstract_0;

public class Demo {
    public static void main(String[] args) {
        InventoryManagement inventoryManagement=new InventoryManagement(100);
        inventoryManagement.add(new WeightedProducts("1","p1",12,10.0));
        inventoryManagement.add(new CountedProducts("2","cp1",20,12));

        inventoryManagement.displayList();

        inventoryManagement.remove(new WeightedProducts("1","p1",12,10.0));
        inventoryManagement.displayList();

    }
}
class CountedProducts extends Product{
    int count;

    public CountedProducts(String id, String name, double price, int count) {
        super(id, name, price);
        this.count = count;
    }

    @Override
    public double getNetPrice(){
        return count*price;
    }



    @Override
    public String toString() {
        return "CountedProducts{" +
                "count=" + count +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class InventoryManagement extends Requirements{
    Product list[];
    int counter=0;

    public InventoryManagement(int capacity) {
        this.list =new Product[capacity];
    }

    @Override
    public boolean add(Object o) {
        if(counter<list.length) {
            list[counter++] = (Product) o;
            return true;
        }
        return false;
    }

    @Override
    public void remove(Object o) {

        Product p=(Product) o;
        for(int i=0;i< list.length;i++)
        {
            if(p.equals(this)) {
                list[i] = null;
                break;
            }
        }

    }
    public void displayList(){  for(Product p:list)
        if(p!=null)
            System.out.println(p);
    }
}

abstract class Requirements {

    public abstract boolean add(Object o);

    public abstract void remove(Object o);
}
class WeightedProducts extends Product{
    double weight;

    public WeightedProducts(String id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    @Override
    public double getNetPrice(){
        return weight*price;
    }

    @Override
    public String toString() {
        return "WeightedProducts{" +
                "weight=" + weight +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
abstract class Product {
    String id;
    String name;
    double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getNetPrice();

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(Object o){

        Product p=(WeightedProducts) o;
        return p.id.equals(this.id);
    }
}

