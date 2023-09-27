import java.util.Scanner;
public class factorial_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer num = input.nextInt();

        int factorial = 1;

        for (int count = num; count >= 1; count--) {

            System.out.print(count + " x ");
            factorial *= count;
        }
        System.out.println(factorial);
    }
}
