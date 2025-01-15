import java.util.Scanner;

public class JavaRolls {

    public static void main(String[] args) {
        System.out.println("Let's play Rolling Java. Type anything to start.");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Great, here are the rules:\\n");
        System.out.println("If you roll a 6, the game stops.");
        System.out.println("If you roll a 4, nothing happens.");

        System.out.println("Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

        int points = 0;
        while (points < 3) {
            int roll = (int) (Math.random() * 6) + 1;
            if (roll == 6) {
                System.out.println("You rolled a 6. Game over.");
                break;
            } else if (roll == 4) {
                System.out.println("You rolled a 4. Nothing happens.");
            } else {
                System.out.println("You rolled a " + roll + ". You get 1 point.");
                points++;
            }
        }
        if (points >= 3) {
            System.out.println("End of game.");
        }

        scanner.close();

    }
}