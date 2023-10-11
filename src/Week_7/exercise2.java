package Week_7;

import java.util.Scanner;

public class exercise2 {

    public static int calculateSum(int num1,int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Second number: ");
        int num2 = input2.nextInt();

        int sum = calculateSum(num1, num2);
        System.out.println("The sum is: " + sum);




    }
}
