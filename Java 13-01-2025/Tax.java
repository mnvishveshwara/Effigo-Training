import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax= new double[price.length];
        for (int i = 0; i < price.length; i++) {

            double taxVal= (price[i]*13)/100;
            afterTax[i]= price[i]+taxVal;
           
            System.out.println("Price: " + price[i] + " After Tax: " + afterTax[i]);
        }

        System.out.println("After Tax: "+ Arrays.toString(afterTax));

            
    }
}
