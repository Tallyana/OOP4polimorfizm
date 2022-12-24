package transport;

public  class DriverC<C extends Driver & Competing> {

    public DriverC(String name, String driversLicense, double experience) {
        super();
    }


    //---------------------------------------------
    public  void startMoving() {
        System.out.println("Водитель "+ Driver.getName()+ " на автомобиле начал движение.");
    }  //начать движение


    public static void stop(){
        System.out.println("Автомобиль" + Bus.getModel() + " остановился.");
    }        //остановиться


    public void refuel(){
        System.out.println("Водитель " + Driver.getName() + " заправился.");
    }                        //заправить



    public String getBusMessage(Bus<Bus> bus6) {
        return "Водитель " + Driver.getName() + "управляет автомобилем " + Bus.getBrand()+ Bus.getModel()
                +" и будет учавствовать в заезде";

    }
    public void getBuSMessage() {
        System.out.println("Водитель " + Driver.getName() + "управляет автомобилем " + Bus.getBrand()+ Bus.getModel()
                +" и будет учавствовать в заезде");

    }
}