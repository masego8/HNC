package Week_2;

import java.util.*;
//This will import scanner which allows us to take user input from the console
public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //This line will take in user input



        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        //this will take the input and store it as the string name

        System.out.println("Enter Your Hobby: ");
        String hobby = input.nextLine();

        System.out.println("There once was a hero that went by the name of "
                + name + "\nwho used to take part in " + hobby + " when they weren't slaying dragons");
    }

}
