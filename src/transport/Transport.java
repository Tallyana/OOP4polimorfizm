
package transport;

public  abstract class Transport extends Object {
    /*«Марка», «Модель»,«Объем двигателя».
    Также все авто имеют:
       метод «начать движение»,
    метод «закончить движение».*/
    private String brand;
    private String model;
    private static double engineVolume;

    public Transport(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Transport(String brand, String model, double engineVolume) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }
        this.engineVolume = engineVolume;
    }


    public abstract void startUp();

    public abstract void stopEnd();

    public String toString() {
        return brand + " Модель " + model + ".Обьем двигателя " + engineVolume;
    }


    public static String getBrand(){
        return getBrand();}

    public void setBrand(String brand) {
        this.brand = brand;
    }

        public static String getModel() {
            return getModel();
        }

        public void setModel(String model){
            this.model = model;
        }


}





