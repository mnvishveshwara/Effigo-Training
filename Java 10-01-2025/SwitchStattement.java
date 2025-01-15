public class SwitchStattement {

    public static void main(String[] args) {
        String weather = "sunny";
        switch (weather) {
            case "sunny":
                System.out.println("YOu can ware shirt");
                break;
            case "cloudy":
                System.out.println("You can ware woddy");
                break;
            case "rainy":
                System.out.println("You can ware raincoat");
                break;
            default:
                System.out.println("You can ware whatever");

        }

    }
}