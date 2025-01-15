import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello, what is ur name ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", I'm javaBot, where are you from?");
        String location = sc.nextLine();
        System.out.println("I hear it's beatiful at "+ location + "! I'm from place called oracle ");
        System.out.println("How old are you");
        int age = sc.nextInt();
        System.out.println("So ypu're "+age+" I'm 400 year old");
        System.out.println("This means i'm "+ (400/age) + " times older than u");
        sc.close();
    }
}
