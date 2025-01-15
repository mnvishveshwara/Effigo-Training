import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("what is your name? ");
        String name = scanner.nextLine();

        System.out.println("How much money u spend on lunch");
        int money = scanner.nextInt();

        scanner.nextLine();
        System.out.println("ur name is " + name + " and u spend " + money + " on ur lunch");


    }
}
