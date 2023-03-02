package transport;


public class BodyType1 {
    public static void main(String[] args) {
        BodyType bodyType = BodyType.SEDAN;
        BodyType bodyType1 = BodyType.CROSSOVER;
        BodyType bodyType2 = BodyType.COUPE;
        BodyType bodyType3 = BodyType.UNIVERSAL;
        BodyType bodyType4 = BodyType.PICKUP;
        BodyType bodyType5 = BodyType.SUV;
        BodyType bodyType6 = BodyType.MINIVAN;

        bodyType.getBodyType();

        System.out.println(bodyType.getBodyType());
        System.out.println(bodyType.getBodyType());
        System.out.println(bodyType.getBodyType());
        System.out.println(bodyType.getBodyType());
    }
}