
package transport;

public  abstract class Transport extends Object {

    private String brand;
    private String model;
    private static double engineVolume;

    public void setDiagnosticsPassed(boolean diagnosticsPassed) {
        isDiagnosticsPassed = diagnosticsPassed;
    }

    private boolean isDiagnosticsPassed;

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

    public boolean checkTransportNeedService() {
        try {
            passDiagnostics();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    public boolean passDiagnostics() {
        this.isDiagnosticsPassed = isDiagnosticsPassed;
        return false;
    }

    public abstract void startUp();

    public abstract void stopEnd();


    public String toString() {
        return brand + " Модель " + model + ".Обьем двигателя " + engineVolume;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }



    public void setModel(String model) {
        this.model = model;
    }



}





