import java.util.*;
public class L4E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the capital of France: ");
        String France = input.nextLine();
        Integer score = 0;

        if (!France.toLowerCase().equals("paris")) {
            System.out.println("Incorrect 👎.Paris is the right answer");
        } else {System.out.println("Correct 👍");
            score ++;
        }

        System.out.println("What is the capital of England: ");
        String England = input.nextLine();

        if (!England.toLowerCase().equals("london")) {
            System.out.println("Incorrect 👎.London is the right answer");
        } else {System.out.println("Correct 👍");
            score ++;
        }

        System.out.println("What is the capital of India: ");
        String India = input.nextLine();

        if (!India.toLowerCase().equals("mumbai")) {
            System.out.println("Incorrect 👎.Mumbai is the right answer");
        } else {System.out.println("Correct 👍");
            score ++;
        }

        if (score == 3) {
            System.out.println("U passed the quiz! ⭐ ");
        } else {
            System.out.println("Better Luck Next Time! 🤡");
        }
    }
}
