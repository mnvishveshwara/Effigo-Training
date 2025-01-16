import java.util.Scanner;

public class TestMovie {

    static Store store= new Store();
    public static void main(String[] args) {
        
        Movie[] film= new Movie[]{
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay",8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "BlueRay",8.8)
        };

        System.out.println("******************************MOVIE STORE*****************************");
        for (int i=0; i< film.length; i++) {
            System.out.println((i+1)+". "+film[i]);
            store.setMovie(i, film[i]);
        }
        userInput();      
        printStore();

    }


    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        String status= "continue";
        while(status.equals("continue")){
            System.out.println("Please choose an integer between 0 - 9: ");
            int choice= scanner.nextInt();
            Movie movie= store.getMovie(choice);

            System.out.println("Set a new rating for "+ movie.getName()+ " : ");
            double rating= scanner.nextDouble();

            movie.setRating(rating);
            printStore();

            scanner.next();
        }
        scanner.close();
    }

    public static void printStore(){
        System.out.println("Store: ");
        System.out.println(store);
    }

   

    
}
