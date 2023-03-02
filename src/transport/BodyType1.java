package transport;
import transport.*;

public class BodyType1 {


    public static void main(String[] args) {
        BodyType bodyType = BodyType.SEDAN;
        BodyType bodyType1 = BodyType.CROSSOVER;
        BodyType bodyType2 = BodyType.COUPE;
        BodyType bodyType3 = BodyType.UNIVERSAL;
        BodyType bodyType4 = BodyType.PICKUP;
        BodyType bodyType5 = BodyType.SUV;
        BodyType bodyType6 = BodyType.MINIVAN;
        BodyType bodyType7 = BodyType.HATCHBACK;
        BodyType bodyType8 = BodyType.VAN;


        System.out.println(bodyType.getTip());
        System.out.println(bodyType1.getTip());
        System.out.println(bodyType2.getTip());
        System.out.println(bodyType3.getTip());
        System.out.println(bodyType4.getTip());
        System.out.println(bodyType5.getTip());
        System.out.println(bodyType6.getTip());
        System.out.println(bodyType7.getTip());
        System.out.println(bodyType8.getTip());


        System.out.println(bodyType.toString());
        System.out.println(bodyType1.toString());
        System.out.println(bodyType2.toString());

        System.out.println(bodyType1);
        System.out.println(bodyType2);
        System.out.println(bodyType3);
        System.out.println(bodyType4);
        System.out.println(bodyType5);
        System.out.println(bodyType6);
        System.out.println(bodyType7);
        System.out.println(bodyType8);

        Size size1 = Size.XS;
        Size size2 = Size.S;
        Size size3 = Size.M;
        Size size4 = Size.L;
        Size size5 = Size.XL;

        System.out.println(size1.getMax());
        System.out.println(size2.getMax());
        System.out.println(size3.getMax());
        System.out.println(size4.getMax());

        System.out.println(size1);
        System.out.println(size2);
        System.out.println(size5);
        System.out.println(size3);



    }
}

