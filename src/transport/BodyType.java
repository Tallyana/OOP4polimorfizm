package transport;


public enum BodyType {
     SEDAN,
    HATCHBACK,
    COUPE,
    UNIVERSAL,
    SUV,
    CROSSOVER,
    PICKUP,
    VAN,
    MINIVAN;
    private BodyType bodyType;




    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }


}
