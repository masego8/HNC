package Week_7;

import java.util.Scanner;

public class subroutine4 {

    public static String getMessage() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        return input.nextLine();
    }

    public static void main(String[] args) {
        String message = getMessage();
        System.out.println("Hello, " + message);
    }
}
