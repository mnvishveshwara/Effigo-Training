import java.util.Scanner;

public class CalenderCheck {
    public static void main(String[] args) {

        System.out.println("Which day u want to go out ?");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        System.out.println("Hmm, let me check my calendar.");

        switch (day) {
            case "Monday":
                System.out.println("Sorry, I have to stay at work late.");
                break;

            case "Tuesday":
                System.out.println("It looks like I have meetings all day.");
                break;
            case "Wednesday":
                System.out.println("I have a dentist appointment. Some other time!");
                break;
            case "Thursday":
                System.out.println("Sorry, thursday is date night!");
                break;
            case "Friday":
                System.out.println("I'm free!!");
                break;
            case "Saturday":
                System.out.println("I'm free!!");
                break;
            case "Sunday":
                System.out.println("I'm free!!");
                break;
            default:
                System.out.println("thats not a day");
        }
    sc.close();
    }
}
