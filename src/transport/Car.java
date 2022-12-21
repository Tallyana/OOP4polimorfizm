package transport;

public class Car extends Transport implements Competing {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public static final String[] CAR_PIT_STOP = {"Поменять пробитые колеса", "Залить бензин", "Выйти перекурить"};

    public static final String[] getCarBestLapTime = {"№7", "№8", "№9"};

    public static final String[] getCarMaxSpeed = {"№10", "№11", "№12"};

    //---------------------------------
    public static void CAR_PIT_STOP() {
        System.out.println(CAR_PIT_STOP[1]);
    }

    public static void getCarBestLapTime() {
        System.out.println(getCarBestLapTime[1]);
    }

    public static void getCarMaxSpeed() {
        System.out.println(getCarMaxSpeed[0]);
    }

    //--------------------------------
    public void startUp() {
        System.out.println(getBrand() + " Начать движение.");
    }

    public void stopEnd() {
        System.out.println(getBrand() + " Закончить движение.");
    }

    //----------------------------------------
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

    //------------------------------------
    public void drive() {
        System.out.println("ДОЕХАЛИ!!");
    }
}