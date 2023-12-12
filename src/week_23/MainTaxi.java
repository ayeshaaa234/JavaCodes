package week_23;

public class MainTaxi {
    public static void main(String[] args) {
        TaxiManager<Taxi> manager = new TaxiManager<>();

        Taxi taxi1 = new Taxi(1, true, new int[]{3, 4});
        Taxi taxi2 = new Taxi(2, true, new int[]{1, 2});
        Taxi taxi3 = new Taxi(3, true, new int[]{5, 6});

        manager.addTaxi(taxi1);
        manager.addTaxi(taxi2);
        manager.addTaxi(taxi3);


        int passengerX = 0;
        int passengerY = 0;

        Taxi nearestTaxi = manager.callNearestTaxi(passengerX, passengerY);

        if (nearestTaxi != null) {
            System.out.println("The nearest taxi is Taxi " + nearestTaxi.getId());
        } else {
            System.out.println("No available taxis nearby");
        }
    }
}
