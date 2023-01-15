package transport;

public  class DriverB<B  extends Car> extends Driver {
    public DriverB(String name, String driversLicense, double experience) {
        super(name, driversLicense, experience);
    }
    //---------------------------------------------
    public  void startMoving() {
        System.out.println("Водитель "+ getName()+ " на автомобиле начал движение.");
    }  //начать движение


    public  void stop(){
        System.out.println("Водитель " + getName() + " остановился.");
    }        //остановиться


    public void refuel(){
        System.out.println("Водитель " + getName() + " заправился.");
    }                        //заправить

    public static String getBrand()
    {
        return getBrand();}

    public String getCarMessage(Car car) {
        return "Водитель " + getName() + "управляет автомобилем " + car.getBrand()+car.getModel()
                +" и будет учавствовать в заезде";

    }

    public void getCarMessage(Transport car) {
        System.out.println("Водитель " + getName() + "управляет автомобилем " + car.getBrand()+car.getModel()
                +" и будет учавствовать в заезде");

    }
}

