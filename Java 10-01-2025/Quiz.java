import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the quiz");
        System.out.println("You will be asked 4 questions");
        System.out.println("You will get 5 point for each correct answer");
        System.out.println("You will get 0 point for each incorrect answer");
        System.out.println("Let's start the quiz");

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String firstAnswer = sc.nextLine();

        System.out.println("2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");

        String secondAnswer = sc.nextLine();

        System.out.println("3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");

        String thirdAnswer = sc.nextLine();

        System.out.println("4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Draco Malfoy\n\tb) Ron Weasley\n\tc) Hermoione granger\n");
        String fourthAnswer = sc.nextLine();

        if (firstAnswer.equals("c")) {
            score += 5;
        }

        if (secondAnswer.equals("a")) {
            score += 5;
        }

        if (thirdAnswer.equals("d")) {
            score += 5;
        }

        if (fourthAnswer.equals("b")) {
            score += 5;
        }

        System.out.println("Your final score is:" + score + "/20");
        sc.close();

    }
}
