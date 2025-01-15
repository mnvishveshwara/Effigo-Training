import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int role1 = roleDice();
        int role2 = roleDice();
        int role3 = roleDice();

        System.out.print("Enter 3 number between 1 - 6 : ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        sc.close();

        System.out.println("role 1 : " + role1);

        if (lessThanRole(number1, number2, number3) || maxThanRole(number1, number2, number3)) {
            System.out.println("You entered numbers are invalid");
            System.exit(0);
        }

        int sumOfNum = number1 + number2 + number3;
        int sumOfRole = role1 + role2 + role3;

        System.out.println("Your total sum is : " + sumOfNum);
        System.out.println("Role total sum is : " + sumOfRole);

        if (userWon(sumOfNum, sumOfRole)) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Sorry, you lost!, Better luck next time");
        }
    }

    public static boolean userWon(int sumOfNum, int sumOfDiceRoll) {
        return (sumOfNum > sumOfDiceRoll && (sumOfNum - sumOfDiceRoll) < 5);
    }

    public static boolean lessThanRole(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean maxThanRole(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static int roleDice() {

        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }
}