import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        String[] aisles={"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        // System.out.println("Do u sell coffee?");
        // for (int i = 0; i < aisles.length; i++) {
        //     if (aisles[i].equals("coffee")) {
        //         System.out.println("We have that in aisle: "+i);

        //     }
        // }

        System.out.println("Welcome to Java Grocer");
        System.out.println("We have the following items: \"apples\", \"bananas\", \"candy\", \"chocolate\", \"coffee\", \"tea\"");
        System.out.println("Do you want to buy something?");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        System.out.println("You want to buy: "+item);
        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals(item)) {
                System.out.println("we have that in aisle: "+ i);
            }
        }
        scanner.close();
    }
}
