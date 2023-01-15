package transport;

public  class DriverD<D extends Driver & Competing>extends Truck<Truck> {

    public DriverD(String name, String driversLicense, double experience) {
        super( name,driversLicense, experience);
    }

    //---------------------------------------------
    public void startMoving() {
        System.out.println("Водитель " + Driver.getName() + " на автомобиле начал движение.");
    }  //начать движение


    public static void stop() {
        System.out.println("Автомобиль" + Truck.getModel() + " остановился.");
    }        //остановиться


    public void refuel() {
        System.out.println("Водитель " + Driver.getName() + " заправился.");
    }                        //заправить


    public String getTruckMessage(Truck<Truck> truck) {
        return "Водитель " + Driver.getName() + "управляет автомобилем " + Truck.getBrand() + Truck.getModel()
                + " и будет учавствовать в заезде";

        }

    public void getTruckMessage() {
    }
}



