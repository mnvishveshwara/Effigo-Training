import java.util.Scanner;

public class TicTacToe {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n lets play tic tac toe");
        char[][] board = {
                { '_', '_', '_' },
                { '_', '_', '_' },
                { '_', '_', '_' }
        };
        printArray(board);

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("turn:  X ");
            int []spot= askuser(board);
            board[spot[0]][spot[1]]= 'X';
            } else {
                System.out.println("turn: O");
                int []spot=askuser(board);
                board[spot[0]][spot[1]]= 'O';
            
            }
            printArray(board);
        }
    }

    public static void printArray(char[][] array) {
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n\n");

        }
    }

    public static int[] askuser(char[][] board) {
        System.out.print(" . pick a row and column number: ");
        int row = scan.nextInt();
        int element = scan.nextInt();
        return new int[] { row, element };
    }
}
