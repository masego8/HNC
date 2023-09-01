import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter something
        System.out.print("Enter something: ");

        // Read the user's input as a String
        String userInput = scanner.nextLine();

        // Display what the user entered
        System.out.println("You entered: " + userInput);

        // Close the Scanner when you're done with it
        scanner.close();
    }
}
