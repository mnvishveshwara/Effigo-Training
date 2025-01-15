import java.util.Scanner;

public class ReturnValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectange");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double breadth = sc.nextDouble();
        System.out.println("Area of rectange for the given input is: " +calculateAreaOfRect(length, breadth));
        sc.close();
    }

    public static double calculateAreaOfRect(double l, double w) {
        double area = l * w;
        return area;
    }
}
