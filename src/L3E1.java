import java.util.*;
public class L3E1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String fname = input.nextLine();


        System.out.println("Enter Your Second Name: ");
        String sname = input.nextLine();

        System.out.println("Enter Your Year Of Birth: ");
        Integer dob = input.nextInt();

        System.out.println("Username: "+ fname.substring(0,1) + sname.toLowerCase());
        System.out.println("Password: "+ sname.substring(0,1) + fname.toUpperCase() + dob);

    }
}
