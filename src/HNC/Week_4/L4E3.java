package Week_4;

import javax.sound.midi.SysexMessage;
import java.util.*;
public class L4E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer shipFee = 10;
        System.out.println("Orders under £50 get free shipping!");
        System.out.println("Enter your total purchase amount:");
        Integer price = input.nextInt();

        if (price > 50) {
            System.out.println("Shipping cost: £" + shipFee);
            System.out.println("Final Total: £" + (price+shipFee));
        } else {
            System.out.println("Free Shipping");
            System.out.println("Final cost: £" + price);
        }


    }
}
