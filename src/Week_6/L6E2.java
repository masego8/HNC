package Week_6;
import java.util.Scanner;
public class L6E2 {
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("1. Say 'hello' " +
                    "\n2. Tell me the time " +
                    "\n3. Tell me a joke " +
                    "\n4. Quit");
            Scanner input = new Scanner(System.in);
            System.out.println("Choose number 1-4 ");
            choice = input.nextInt();


        } while (choice < 4 ); {
            System.out.println("You have exited the program");
        }
    }
}
