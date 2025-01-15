import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        int[] tickets = { 34, 43, 45, 65, 21, 54 };
        int[] tickets2 = Arrays.copyOf(tickets, tickets.length);
        tickets2[2] = 54;

        System.out.print("Ticket 1 numbers: ");
        printTicketNumber(tickets);

        System.out.print("Ticket 2 numbers: ");
        printTicketNumber(tickets2);

    }

    public static void printTicketNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.print("\n\n");
    }
}
