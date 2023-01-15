

package transport;

public abstract class Driver < A extends Transport & Competing > {

    private String name;               //имя
    private String driversLicense;   //категория прав
    private double experience;       //стаж



    //---------------------------------------------
     abstract  void startMoving();   //начать движение


     abstract void stop();        //остановиться


    abstract void refuel();                        //заправить

    void driver(A transport){
        System.out.println("???????????"+ transport.getBrand());
    }
//----------------------------------------------------


    public Driver(String name, String driversLicense, double experience) {


        if (name != null && !name.isEmpty())
            this.name = name;
        if (driversLicense != null && !driversLicense.isEmpty())
            this.driversLicense = driversLicense;
        this.experience = experience;
    }

    //---------------
    public static String getName() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
    //------------------------------
    public String toString() {
        return  " Водитель " + name + "управляет автомобилем " + getExperience() +" и будет учавствовать в заезде";
    }

}

