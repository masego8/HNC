import java.util.*;
import java.util.Random;

public class L5E3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int score = 0;



        for (int count = 1; count<=10; count+=1)
        {
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            int ans = num1 * num2;

            System.out.println(num1 + " x " + num2 + " = ");

            Integer answer = input.nextInt();
            if (answer == ans)
            {
               System.out.println("Correct");
               score++;
            }
        }
        System.out.println("Your Score = " + score);


    }
}
