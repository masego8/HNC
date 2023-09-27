package Week_3;

import java.util.*;
public class L3E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the capital of France: ");
        String France = input.nextLine();
        System.out.println(France.toLowerCase().contains("paris"));


        System.out.println("What is the capital of England: ");
        String England = input.nextLine();
        System.out.println(England.toLowerCase().contains("london"));

        System.out.println("What is the capital of India: ");
        String India = input.nextLine();
        System.out.println(India.toLowerCase().contains("mumbai"));
    }
}
