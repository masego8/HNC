package Lesson1.ATM;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM(50);


        Scanner sc = new Scanner(System.in);


        System.out.println("Make A Choice \n" +
                "1. Get Balance \n" +
                "2. Deposit \n" +
                "3. Withdraw \n");
        int choice = sc.nextInt();


        if (choice == 1) {
            System.out.println("Balance £" + atm.getBalance());
        }
        else if (choice == 2) {
            Scanner deposit = new Scanner(System.in);
            System.out.println("How much do you want to deposit? ");
            double depositAmount = deposit.nextDouble();
            atm.deposit(depositAmount);
        }
        else if (choice == 3) {
            Scanner withdraw = new Scanner(System.in);
            System.out.println("How much do you want to withdraw? ");
            double withdrawAmount = withdraw.nextDouble();
            atm.withdraw(withdrawAmount);
        }
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
