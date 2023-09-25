package Week_2;

import java.util.*;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter First Number: ");
        Integer firstNumber = input.nextInt();
        //The line above takes input but as an integer instead of string

        System.out.println("Enter Second Number: ");
        Integer secondNumber = input.nextInt();

        int add = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int multi = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + add);
        System.out.println(firstNumber + " - " + secondNumber + " = " + sub);
        System.out.println(firstNumber + " x " + secondNumber + " = " + multi);
        System.out.println(firstNumber + " / " + secondNumber + " = " + div);


    }
}
