// do while loop is where we will be using do{code executed } while(condition);
// it is used atleast to once the code should be run/executed .

//here, is a example  of ATM One time insert the value

import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. View Balance");
            System.out.println("2. Transfer Money");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            System.out.println("You selected: " + choice);
            System.out.println();

        } while (choice != 3);

        System.out.println("Thank you! Exiting...");
        sc.close();
    }
}
