public class Tip {
    public static void main(String[] args) {
        double bill = 58.62;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Customer: Yes, it was delicious! The service was great too.");
        System.out.println("Waiter: Thank you!");
        System.out.println("the total bill is " + bill);
        tipWaiter(bill);
    }

    public static void tipWaiter(double total) {
        double tip = total * 0.15;
        System.out.println("Your service was wonderful! Please, accept this tip: " + tip);
    }
}
