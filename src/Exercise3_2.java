
import java.util.*;
public class Exercise3_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter Name of Item: ");
        String Item1 = input.nextLine();
        System.out.println("Enter Price of " + Item1 + ": ");
        float price1 = input.nextFloat();

        //we have to use another input after nextFloat() as it doesnt create a new line

        Scanner input2 = new Scanner (System.in);
        System.out.println("Enter Name of Item: ");
        String Item2 = input2.nextLine();
        System.out.println("Enter Price of " + Item2 + ": ");
        float price2 = input2.nextFloat();

        Scanner input3 = new Scanner (System.in);
        System.out.println("Enter Name of Item: ");
        String Item3 = input3.nextLine();
        System.out.println("Enter Price of " + Item3 + ": ");
        float price3 = input3.nextFloat();



        float totalCost = price1 + price2 + price3;

        System.out.println("NESMART");
        System.out.format("%s ...£ %.2f%n",Item1, price1);
        System.out.format("%s ...£ %.2f%n",Item2, price2);
        System.out.format("%s ...£ %.2f%n",Item3, price3);
        System.out.format("SUBTOTAL ...£ %.2f%n", totalCost);

        //%s lets us use a variable name
        // %.2f writes the float to 2 decimal places
        //%n print on the next line
    }
}
