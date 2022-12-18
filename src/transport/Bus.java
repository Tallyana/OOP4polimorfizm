package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model);
    }

    public void startUp() {
        System.out.println(getBrand() + " Начать движение.");
    }

    public void stopEnd() {
        System.out.println(getBrand() + " Закончить движение.");
    }
}