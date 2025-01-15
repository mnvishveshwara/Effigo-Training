public class Prices {
    public static void main(String[] args) {
        double pricess[][] = {
                { 12.99, 8.99, 9.99, 10.49, 11.99 },
                { 0.99, 1.99, 2.49, 1.49, 2.99 },
                { 8.99, 7.99, 9.49, 9.99, 10.99 }
        };
for (int i = 0; i < pricess.length; i++) {

    for (int j=0; j< pricess.length; j++){
    System.out.print("Baking: " );

        switch (i) {
            case 0:
                System.out.print(pricess[i][j] + " ");
                break;
            case 1:  System.out.print("Beverages: " );
            System.out.print(pricess[i][j] + " ");
            break;
            case 2:  System.out.print("Cereals: ");
            System.out.print(pricess[i][j] + " ");
            break;
              
        }
    }
}
    }
}