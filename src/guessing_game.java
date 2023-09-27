import java.util.*;
import java.util.Random;
public class guessing_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(10);
        System.out.println("Guess The Number");
        System.out.println("You have 5 attempts to guess my number");
        System.out.println("Good luck");

        for (int count = 1; count <= 5; count++){

            System.out.println("Enter your guess (1 - 10) : ");
            Integer guess = input.nextInt();

            if (guess == num){
                System.out.println("Correct");
                break;
            }


        }
        System.out.println("The mystery number was " + num);
    }
}
