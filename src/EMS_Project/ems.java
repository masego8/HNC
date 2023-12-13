package EMS_Project;

import Week_12.Student;

import java.util.*;
import java.io.*;

public class ems {

    public static ArrayList<Staff> loadFile(String filename) {
        List<String> staffDetails;
        ArrayList<Staff> thisStaff = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null) {
                staffDetails = Arrays.asList(line.split(","));
                Staff newStaff = new Staff();
                newStaff.employeeId = Integer.parseInt(staffDetails.get(0));
                newStaff.firstname = staffDetails.get(1);
                newStaff.surname = staffDetails.get(2);
                newStaff.role = staffDetails.get(3);
                String email = newStaff.firstname.substring(0, 1).toLowerCase() + newStaff.surname.toLowerCase() + "@workplace.com";
                newStaff.email = email;
                thisStaff.add(newStaff);
                line = in.readLine();

            }

        } catch (IOException e) {
            System.out.println("Error occurred reading from file: " + e.toString());
        }

        return thisStaff;
    }

    public static void displayEmployee(ArrayList<Staff> employees) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/EMS_Project/employeeDetails.txt"))) {
            int staffCount = 0;

            while (reader.readLine() != null) {
                staffCount++;
            }

            System.out.println("We currently have " + staffCount + " members of staff");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        for (Staff employee : employees) {

            System.out.println(employee.firstname.toLowerCase()
                    + employee.surname.toLowerCase());;
        }
        System.out.println("");
        menu(employees);
    }

    public static void addEmployee() {
        String nav2;
        do {
            Random random = new Random();

            Scanner input = new Scanner(System.in);

            int employeeNum = random.nextInt(900000) + 100000;
            System.out.println("Enter Firstname: ");
            String firstname = input.nextLine();
            System.out.println("Enter Surname: ");
            String surname = input.nextLine();
            System.out.println("Enter Role: ");
            String role = input.nextLine();
            String email = firstname.substring(0,1).toLowerCase() + surname.toLowerCase() + "@workplace.com";


            String employeeInfo = employeeNum + "," + firstname + " ," + surname + "," + role + "," + email;

            try (
                    FileWriter out = new FileWriter("src/EMS_Project/employeeDetails.txt", true)) {
                out.write(employeeInfo + "\n");
                System.out.println(firstname + " " + surname + " has succesfully onboarded!");
            } catch (IOException e) {
                System.out.println("Error occured writing to file: " + e.toString());
            }

            Scanner input2 = new Scanner(System.in);
            System.out.println("Would you like to add more employees? (Y / N)");
            nav2 = input2.nextLine();

        } while (nav2.equals("y"));

        menu();






    }


    public static void menu(ArrayList<Staff> employees) {
        Scanner navigation = new Scanner(System.in);
        System.out.println("Add Employee (1)\n" +
                "Remove Employee (2)\n" +
                "View Employees (3) \n" +
                "Enter number from 1 - 3" );


        int nav = navigation.nextInt();

        if (nav == 1) {
            addEmployee();

        }
        if (nav == 2) {
            // removeEmployee();
        }

        if (nav == 3) {
            displayEmployee(employees);
        }
    }


    //MAIN PROGRAM
    public static void main(String[] args) {


        System.out.println("Employee Management System\n");
        ArrayList<Staff> employees = loadFile("src/EMS_Project/employeeDetails.txt");
        menu(employees);




    }
}
