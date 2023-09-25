package Week_4;

import java.util.*;
public class L4E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String fname = input.nextLine();


        System.out.println("Enter Your Second Name: ");
        String sname = input.nextLine();

        System.out.println("Enter total value of order: ");
        Float totalPrice = input.nextFloat();

        System.out.println("Enter deposit amount: ");
        Float deposit = input.nextFloat();

        Float remainder = totalPrice - deposit;

        System.out.println("== RECEIPT ==");
        System.out.println("Customer: " + fname.substring(0,1) + " " + sname);
        System.out.println("Order Total: £" + totalPrice);
        System.out.println("Deposit paid: £" + deposit);
        System.out.println("Remainder: £" + remainder);

        if (deposit > 100) {
            System.out.println("Congratulations! You get a Free Toaster");
        }




    }
}
