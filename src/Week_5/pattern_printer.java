package Week_5;

import java.util.Scanner;
public class pattern_printer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of times to repeat the pattern: ");
        int repeatPattern =input.nextInt();

        String pattern = "⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐";

        for (int count = 0; count < repeatPattern; count++) {
            System.out.println(pattern);
        }
    }
}
