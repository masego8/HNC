package Week_2;

import java.util.*;
public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter Price of Item 1: ");
        float item1 = input.nextFloat();

        System.out.println("Enter Price of Item 2: ");
        float item2 = input.nextFloat();

        System.out.println("Enter Price of Item 3: ");
        float item3 = input.nextFloat();

        float totalCost = item1 + item2 + item3;

        System.out.println("Item 1 .....£" + item1);
        System.out.println("Item 2 .....£" + item2);
        System.out.println("Item 3 .....£" + item3);
        System.out.println("SUBTOTAL ...£" + totalCost);



    }
}
