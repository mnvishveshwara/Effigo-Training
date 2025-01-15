public class AppleProblem {
    public static void main(String[] args) {
        double oneApplePrice=0.40;
        int totalApple= 500;
        int customer=0;
        double profit=0;


        totalApple-=4;
        customer++;
        totalApple-=20;
        customer++;
        
        totalApple-=200;
        customer++;

        profit=(500-totalApple) * oneApplePrice;

        System.out.println("total customer "+ customer + " Total Profit "+ profit + " Apple left " + totalApple);


    }
}
