import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are");

        String answer = scanner.nextLine();
        if (answer.equals("yes") || answer.equals("Yes")) {
            System.out.println("print: Great!");
            ;
            System.out.println("print: rock - paper - scissors, shoot!");
            String choice = scanner.nextLine();
            String computerAnswer = computeChoice();
            System.out.println("You chose: " + choice);
            System.out.println("Computer chose: " + computerAnswer);

            System.out.println(winCalculate(choice, computerAnswer));

        }

        scanner.close();

    }

    public static String winCalculate(String userChoice, String compChoise) {
        if (userChoice.equals(compChoise)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && compChoise.equals("scissors"))) {
            return "Rock smashes scissors! You win!";
        } else if ((userChoice.equals("paper") && compChoise.equals("rock"))) {
            return "Paper covers rock! You win!";
        } else if ((userChoice.equals("scissors") && compChoise.equals("paper"))) {
            return "Scissors cuts paper! You win!";
        } else {
            return "Computer wins!";
        }
    }

    public static String computeChoice() {
        int randomNumber = (int) (Math.random() * 3);
        System.out.println(randomNumber);
        if (randomNumber == 0) {
            return "rock";
        }

        else if (randomNumber == 1) {
            return "paper";
        }

        else if (randomNumber == 2) {
            return "scissors";
        } else {
            return "Invalid choice";
        }
    }

}
