import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("select the option u want to calculate the area");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("4. Area of Square");

        String option = sc.nextLine();
        switch (option) {
            case "1":
                System.out.println("Enter the radius of the circle in cm");
                double r = sc.nextDouble();
                System.out.println("Area of circle is : " + areaCircle(r));
                break;
            case "2":
                System.out.println("Enter the length of the rectangle in cm");
                double l = sc.nextDouble();
                System.out.println("Enter the breadth of the rectangle in cm");
                double b = sc.nextDouble();
                System.out.println("Area of rectangle is : " + areaRectangle(l, b));
                break;
            case "3":
                System.out.println("Enter the base of the triangle in cm");
                double b1 = sc.nextDouble();
                System.out.println("Enter the height of the triangle in cm");
                double h = sc.nextDouble();
                System.out.println("Area of triangle is : " + areaTriangle(b1, h));
                break;
            case "4":
                System.out.println("Enter the side of the square in cm");
                double s = sc.nextDouble();
                System.out.println("Area of square is : " + areaSquare(s));
                break;
            default:
                System.out.println("Invalid option");

        }
        sc.close();
    }

    /**
     * method name: area of Triangle
     * @param base
     * @param height
     * @return
     * this method calculates the area of the triangle
     * 
     */

    public static double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    /**
     * method name: areaSquare
     * @param length
     * @return
     * This method calculates the area of square
     */

    public static double areaSquare(double length) {
        return length * length;
    }


    /**
     * 
     * Method name: Area of Rectangle
     * @param length
     * @param breadth
     * @return Area of rectangle
     * 
     */

    public static double areaRectangle(double length, double breadth) {
        return length * breadth;
    }

    /**
     * 
     * Method name: areaCircle
     * @param radius
     * @return radius of circle
     * @description This method calculates the area of a circle using the formula pi*r^2
     */
    public static double areaCircle(double radius) {
        return 3.14 * radius * radius;
    }
}
