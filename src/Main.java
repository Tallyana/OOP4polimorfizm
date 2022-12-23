import transport.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ауди","А8L",2.5);
        Car car2 = new Car("BMW","Z8",3.5);
        Car car3 = new Car("Kia","Sportage",2.8);
        Car car4 = new Car("Hundai","Avante",3.0);

        Bus bus1 = new Bus ("Ikarus","b355",10.0);
        Bus bus2 = new Bus ("Maz","d241",11.0);
        Bus bus3 = new Bus ("liAz","l529260",12.0);
        Bus bus4 = new Bus ("Daewoo","BS106",13.0);

        Truck truck1 = new Truck ("Gaz","no",12.0);
        Truck truck2 = new Truck ("Maz","no1",11.0);
        Truck truck3 = new Truck ("Kamaz","no2",13.0);
        Truck truck4 = new Truck ("Ural","no3",10.0);
      //------------------------------------
        car1.startUp();
        car2.stopEnd();

        System.out.println(truck4.getBrand());
        System.out.println(bus2.toString());
        System.out.println(bus1.toString());
        System.out.println(car4.toString());
        //-------------------------------------------

        Truck.getTruckPitStop();
        Truck.getTruckBestLapTime();
        Truck.getTruckMaxSpeed();


        Bus.BUS_PIT_STOP();
        Bus.getBusBestLapTime();
       Bus.getBusMaxSpeed();

       Car.CAR_PIT_STOP();
        Car.getCarBestLapTime();
        Car.getCarMaxSpeed();
        //-------------------------
        truck2.drive();
        bus1.drive();
        car3.drive();
        //----------------------------------------------Дженерики

    }
}
