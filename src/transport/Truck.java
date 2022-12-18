package transport;

public class Truck extends Transport {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model);

    }

    public Truck(double engineVolume) {
        super(engineVolume);

    }

    public  void startUp () {
        System.out.println(getBrand()+" Начать движение.");
    }

    public void stopEnd () {
        System.out.println(getBrand()+" Закончить движение.");
    }
}
