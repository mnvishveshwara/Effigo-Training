public class WorkBook {
    public static void main(String[] args) {
        double sales= 24309.65;
        double profit=18562.18;
        double refund= 688.78;
        double shipping = 1233.57;
        System.out.println("this month we made " + (int) sales+ " in sales" );
        System.out.println("Factoring in costs, we made " + (int) profit + " in profit");
        System.out.println(" the refunds are at low " + (int) refund + ". this is a good sign!");
        System.out.println("Shipping costs are high. we paid " +(int) shipping + " in shipping!!");
    }
}
