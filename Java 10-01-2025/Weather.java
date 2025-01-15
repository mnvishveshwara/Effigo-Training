public class Weather {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 65;

        System.out.println("The weather at noon is " + fahrenheitToCelcius(noon) + " degree Celcius");
        System.out.println("The weather at noon is " + fahrenheitToCelcius(evening) + " degree Celcius");

    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
