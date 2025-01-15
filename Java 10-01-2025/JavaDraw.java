import java.util.Scanner;

public class JavaDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWhich animal would you like to draw?\n");
        System.out.println("Write 1 for butterfly ");
        System.out.println("Write 2 for elephant  ");
        System.out.println("Write 3 for bear      ");
        System.out.println("Write 4 for snake     ");

        int option= scanner.nextInt();
        draw(option);
        scanner.close();
    }

    public static void draw(int option){
        switch (option) {
            case 1: System.out.println("A butterfly is draw"); break;
            case 2: System.out.println("An elephant is draw"); break;
            case 3: System.out.println("A bear is draw"); break;
            case 4: System.out.println("A snake is draw"); break;
            default: System.out.println("Send proper options");
            
        }
    }
}
