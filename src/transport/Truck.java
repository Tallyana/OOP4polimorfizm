package transport;

public class Truck extends Transport implements Competing {
    public static String[] getTruckPitStop = {"Поменять колеса", "Залить топливо 2", "Выйти перекурить"};

    public static String[] getTruckBestLapTime = {"№3", "№4", "№5"};

    public static String[] getTruckMaxSpeed = {"№1", "№2", "№6"};

    public static void getTruckPitStop() {
        System.out.println(getTruckPitStop[0]);
    }

    public static void getTruckBestLapTime() {
        System.out.println(getTruckBestLapTime[1]);
    }

    public static void getTruckMaxSpeed() {
        System.out.println(getTruckMaxSpeed[0]);
    }

    //--------------------------------------------
    @Override
    public String[] getPitStop() {
        return new String[0];
    }

    @Override
    public String[] getBestLapTime() {
        return new String[0];
    }

    @Override
    public String[] getMaxSpeed() {
        return new String[0];
    }

    //----------------------------------------------------------
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Truck(double engineVolume) {
        super(engineVolume);
    }

    public void startUp() {
        System.out.println(getBrand() + " Начать движение.");
    }

    public void stopEnd() {
        System.out.println(getBrand() + " Закончить движение.");
    }
    //---------------------------------------------------

    @Override
    public  void drive() {
        System.out.println("ПОЕХАЛИ!!");
    }
}