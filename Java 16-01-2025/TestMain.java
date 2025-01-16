import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Main person= new Main("Rayan slim",  "Indian","01-01-2001", 1);

        person.chooseSeat();

        if (person.applyPassport()) {
            person.setPassport();
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved! and ur seat number is : "+person.getSeatNumber() );
        }
        else{
            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");
        }

        System.out.println("Name : " +person.getName());
        System.out.println("Date of Birth : " +person.getDob());
        System.out.println("Nationality : " +person.getNationality());
        System.out.println("Seat Number : " +person.getSeatNumber());
        System.out.println("Passport: "+Arrays.toString(person.getPassport()) );
        




    }
}
