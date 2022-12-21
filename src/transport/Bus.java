package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public static final String[] BUS_PIT_STOP = {"Поменять колеса", "Залить топливо 2", "Выйти перекурить"};

    public static final String[] getBusBestLapTime = {"№13", "№14", "№15"};

    public static final String[] getBusMaxSpeed = {"№16", "№17", "№18"};

    public void startUp() {
        System.out.println(getBrand() + " Начать движение.");
    }

    public void stopEnd() {
        System.out.println(getBrand() + " Закончить движение.");
    }

    //----------------------------------------------------
    public static void BUS_PIT_STOP() {
        System.out.println(BUS_PIT_STOP[0]);
    }

    public static void getBusBestLapTime() {
        System.out.println(getBusBestLapTime[1]);
    }

    public static void getBusMaxSpeed() {
        System.out.println(getBusMaxSpeed[0]);
    }

    //---------------------------------------------
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
        System.out.println("УЕХАЛИ!!");
    }
}