
package transport;

public  abstract class Transport extends Object {

    private String brand;
    private String model;
    private static double engineVolume;

    private  boolean diagnosticsPassed;

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
     public boolean isDiagnosticsPassed(){
        return diagnosticsPassed ;}


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





