package transport;


public enum BodyType {
     SEDAN("Cидан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Сэв"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Вэн"),
    MINIVAN("Минивэн");



    private BodyType bodyType;

    private String tip;
    BodyType(String tip){
      this.tip = tip;
    }

    public String getTip() {
        return tip;
    }

    public BodyType getBodyType() {
        return bodyType;
    }


    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова {" + "Тип =" + tip + '}';
    }
}
