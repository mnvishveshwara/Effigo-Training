import java.util.Scanner;

public class TestNewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        NewCar[] cars= new NewCar[]{
            new NewCar("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new NewCar("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new NewCar("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new NewCar("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new NewCar("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
   
        };

        DealerShip dealerShip= new DealerShip(cars);

        NewCar carAtIndex0= dealerShip.getCar(0);
        System.out.println("Original car make : " + carAtIndex0.getMake());

        carAtIndex0.setMake("Roles Royes");
        System.out.println("Updated car make : " + carAtIndex0.getMake());

        System.out.println("Dealership car make : "+ dealerShip.getCar(0).getMake());

        NewCar hosCar= new NewCar("roles royes", 100000,2020,"silver", new String[] {"tires", "Air bag"} );

        dealerShip.setCar(1, hosCar);

        System.out.println("\n *****Java Dealership****\n");

        System.out.println("Feel free to browse through our collectioon of cars.\n");
        System.out.println(dealerShip.toString());
        System.out.println("Which cars are u intrested in? (0-4). \n");

        int choice = scanner.nextInt();
        dealerShip.sell(choice);

        scanner.close();


    }
}
