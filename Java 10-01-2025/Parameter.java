import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of rectange");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double breadth = sc.nextDouble();
        calculateAreaOfRect(length,breadth);

        sc.close();
    }

    public static void calculateAreaOfRect(double l, double w){
        double area = l * w;
        System.out.println("area of the rectange is : "+area);

    }
}
