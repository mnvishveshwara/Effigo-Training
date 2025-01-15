public class Receoit {
    public static void main(String[] args) {
        String[] apples={"Gala", "Granny Smith", "Macintosh"};
        double[] price={
            1.99, 1.49, 2.29
        };
        System.out.println("Here's is your receipt");

        for (int i = 0; i < apples.length; i++) {
            System.out.println(apples[i] + ": "+price[i]);
        }
    }
}
