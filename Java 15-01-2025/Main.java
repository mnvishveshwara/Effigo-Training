public class Main {
    public static void main(String[] args) {
        Car nissanCar= new Car("Nissan", 300000,2015, "black" );
        System.out.println("Make: "+nissanCar.make);
        System.out.println("Price: "+nissanCar.price);
        Car bmwCar= new Car("BMW", 5800000, 2020, "white");
        System.out.println("Make: "+bmwCar);
    }
}
