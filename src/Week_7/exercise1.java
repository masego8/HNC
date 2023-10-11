package Week_7;

import java.util.Scanner;

public class exercise1 {
    public static void showMenu(){
        System.out.println("1. Say 'hello' " +
                "\n2. Tell me a joke " +
                "\n3. Tell me the time " +
                "\n4. Quit");
    }
    public static int getOption(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Choice: ");
        return input.nextInt();
    }
    public static void option1(){
        System.out.println("\nHello World!\n ");
    }
    public static void option2(){
        System.out.println("\nKnock knock\n ");
    }
    public static void option3(){
        System.out.println("\nThe time is dinner time\n");
    }

    public static void main(String[] args) {

    int choice;

        do {
            showMenu();
            choice = getOption();

            if (choice == 1) {
                option1();
            }
            if (choice == 2) {
                option2();
            }
            if (choice == 3) {
                option3();
            }







        }
        while (choice != 4); {
            System.out.println("Goodbye!");
        }

    }
}
