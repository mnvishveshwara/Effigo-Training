public class TestCar {

    public static void main(String[] args) {
        
        String[] spareParts= new String[]{"Tires", "keys"};
        Car myCar= new Car(13,"nissan", "NMW", 2015,3659866,spareParts );

        Car newCar= new Car(myCar);

        newCar.setFuelLevel(10);
        newCar.setMake("Audi");
        newCar.setModel("white");
        newCar.setYear(2020);
        newCar.setPrice(8965874);

        myCar.setFuelLevel(15);
        myCar.setMake("BMW");
        myCar.setModel("white");
        myCar.setYear(2016);
        myCar.setPrice(8965874);
        int fuel = myCar.getFuelLevel();
        System.out.println("Fuel level: " + fuel);


        newCar.drive();
    }
}
