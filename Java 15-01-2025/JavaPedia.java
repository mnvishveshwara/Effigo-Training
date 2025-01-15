import java.util.Scanner;

public class JavaPedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many historical figures will u register:  ");
        int people = scanner.nextInt();
        scanner.nextLine();

        String database[][] = new String[people][3];
        for (int i = 0; i < database.length; i++) {
            System.out.print("\t .Name: ");
            database[i][0]= scanner.nextLine();
            System.out.print("\t Date of birth: ");
            database[i][1]=scanner.nextLine();
            System.out.print("\t Occupation: ");
            database[i][2]=scanner.nextLine();
            System.out.print("\n");
        }

        System.out.println("data is stored");
        print2DArray(database);
        System.out.print("\nWho do u wnt info on? ");
        String name = scanner.nextLine();
        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.println(database[i][0] + " was born on " + database[i][1] +" and his ocupation is "+ database[i][2]);
                

        }
        scanner.close();
    }


    }

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

}
