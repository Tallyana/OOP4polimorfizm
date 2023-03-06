package transport;

public class Bus<D> extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public static final String[] BUS_PIT_STOP = {"Поменять колеса", "Залить топливо 2", "Выйти перекурить"};

    public static final String[] getBusBestLapTime = {"Лучшее время круга у №13", "Лучшее время круга у №14", "Лучшее время круга у №15"};

    public static final String[] getBusMaxSpeed = {"Максимальная скорость у №16", "Максимальная скорость у №17", "Максимальная скорость у №18"};


    /*public boolean isDiagnosticsPassed()
    throws TransportTypeException {
        throw new TransportTypeException
      ("Автобусы не должны проходить диагностику");
    }*/

    @Override
    public boolean passDiagnostics() {
        return super.passDiagnostics();
    }

    public void startUp() {
        System.out.println(getModel() + " Начать движение.");
    }

    public void stopEnd() {
        System.out.println(getModel() + " Закончить движение.");
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


    public  void printType()
    {  System.out.println("“Данных по транспортному средству недостаточно.");
    }
}

