import transport.*;


public class Main {
    public static void main(String[] args) {
        Car<Car> car1 = new Car<Car>("Ауди","А8L",2.5);
        Car<Car> car2 = new Car<Car>("BMW","Z8",3.5);
        Car<Car> car3 = new Car<Car>("Kia","Sportage",2.8);
        Car<Car> car4 = new Car<Car>("Hundai","Avante",3.0);

        Bus<Bus> bus1 = new Bus<Bus>("Ikarus","b355",10.0);
        Bus<Bus> bus2 = new Bus<Bus>("Maz","d241",11.0);
        Bus<Bus> bus3 = new Bus<Bus>("liAz","l529260",12.0);
        Bus<Bus> bus4 = new Bus<Bus>("Daewoo","BS106",13.0);

        Truck<Truck> truck1 = new Truck<Truck>("Gaz","no",12.0);
        Truck<Truck> truck2 = new Truck<Truck>("Maz","no1",11.0);
        Truck<Truck> truck3 = new Truck<Truck>("Kamaz","no2",13.0);
        Truck<Truck> truck4 = new Truck<Truck>("Ural","no3",10.0);
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

        DriverB driverB = new DriverB("Сергей", "В", 3.0);
        DriverC driverC = new DriverC("Игорь", "C",5.0);
        DriverD driverD = new DriverD("Пётр", "Д",8.5);



        Bus<DriverC> bus5 = new Bus <>("Ikarus","b355",10.0);
        Bus <DriverC> bus6 = new Bus <>("Maz","d241",11.0);
        Bus <DriverC> bus7 = new Bus <>("liAz","l529260",12.0);
        Bus <DriverC> bus8 = new Bus <>("Daewoo","BS106",13.0);


        Truck<DriverD> truck7 = new Truck<>("Gaz","no",12.0);
        Truck<DriverD> truck5 = new Truck<>("Maz","no1",11.0);
        Truck<DriverD> truck6 = new Truck<>("Kamaz","no2",13.0);
        Truck<DriverD> truck8 = new Truck<>("Ural","no3",10.0);


        driverD.getTruckMessage(truck5);
        driverC.getBusMessage(bus8);

        System.out.println(bus8.toString());
    }
}
