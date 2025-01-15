import java.util.Scanner;

public class NextLinePit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your First name:");
            String fName = sc.nextLine();
            System.out.println("Enter your Last name:");
            String lName = sc.nextLine();
            System.out.println("How old are you?");
            int age= sc.nextInt();
            sc.nextLine();
            System.out.println("Make a username");
            String userName=sc.nextLine();
            System.out.println("what city do u live in ?");
            String city=sc.nextLine();
            System.out.println("what country is that");
            String country=sc.nextLine();
            System.out.println("\tYour details are:");
            System.out.println("\tFirst name: "+fName);
            System.out.println("\tLast name: "+lName);
            System.out.println("\tAge "+age);
            System.out.println("\tUserName: " +userName);
            System.out.println("\tCity: "+city);
            System.out.println("\tcountry "+country);
        }        
    }
}
