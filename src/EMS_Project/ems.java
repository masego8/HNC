package EMS_Project;

import Week_12.Student;

import java.util.*;
import java.io.*;

public class ems {
    public static void managerMenu(ArrayList<Staff> employees) {
        Scanner navigation = new Scanner(System.in);
        int nav;

        do {

            System.out.println("Add Employee (1)\n" +
                    "Remove Employee (2)\n" +
                    "View Employees (3)\n" +
                    "Exit (0)\n" +
                    "Enter a number from 0 to 3:");

            nav = navigation.nextInt();
            //navigation.nextLine();  // Consume the newline character

            if (nav == 1) {
                addEmployee();
            } else if (nav == 2) {
                removeEmployee();
            } else if (nav == 3) {
                displayEmployee(employees);
            } else if (nav == 0) {
                System.out.println("Exiting the menu. Goodbye!");
            } else {
                System.out.println("Invalid option. Please enter a number from 0 to 3.");
            }

        } while (nav != 0);
    }

    public static void crewMenu(ArrayList<Staff> employees) {
        Scanner navigation = new Scanner(System.in);
        int nav;

        do {
            System.out.println(
                    "View Staff (1)\n" + "View Profile (2)\n" +
                    "Exit (0)\n" +
                    "Enter a number from 0 to 3:");

            nav = navigation.nextInt();


            if (nav == 1) {
                displayEmployee(employees);
            } else if (nav == 2) {
                System.out.println("Feature not available yet!");
            } else if (nav == 0) {
                System.out.println("Exiting the menu. Goodbye!");
            } else {
                System.out.println("Invalid option. Please enter a number from 0 to 3.");
            }

        } while (nav != 0);
    }

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

    public static void login(ArrayList<Staff> employees) {
        Scanner input = new Scanner(System.in);
        int loginAttempts = 0;
        final int maxLoginAttempts = 3;

        do {
            System.out.println("Enter email:");
            String username = input.nextLine();

            System.out.println("Enter password:");
            String password = input.nextLine();

            String userRole = authenticateUser(username, password);

            if (userRole != null) {
                System.out.println("Login successful! Welcome, " + username + ".\n");
                if ("Manager".equalsIgnoreCase(userRole)) {
                    managerMenu(employees);
                } else if ("Crew".equalsIgnoreCase(userRole)) {
                    crewMenu(employees);
                } else {
                    System.out.println("Unknown role: " + userRole);
                }
                // Proceed with the rest of your program or menu
                return; // Break out of the loop if login is successful
            } else {
                System.out.println("Login failed. Invalid username or password. Attempts left: " + (maxLoginAttempts - loginAttempts - 1));
                loginAttempts++;
            }

        } while (loginAttempts < maxLoginAttempts);

        System.out.println("Maximum login attempts reached. Exiting the program.");
    }

    private static String authenticateUser(String enteredUsername, String enteredPassword) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/EMS_Project/employeeDetails.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                String storedUsername = employeeData[4].trim(); // Assuming username is stored in the second column
                String storedPassword = employeeData[1].trim(); // Assuming password is stored in the third column

                if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
                    return employeeData[3].trim(); // Authentication successful
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading employee details file: " + e.getMessage());
        }

        return null; // Authentication failed
    }
    public static void displayEmployee(ArrayList<Staff> employees) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/EMS_Project/employeeDetails.txt"))) {
            int staffCount = 0;

            while (reader.readLine() != null) {
                staffCount++;
            }

            System.out.println("We currently have " + staffCount + " members of staff\n");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        for (Staff employee : employees) {

            System.out.println(employee.firstname.toLowerCase()
                    + employee.surname.toLowerCase());;
        }
        System.out.println("");
    }
    public static void addEmployee() {
        String nav2;
        do {
            Random random = new Random();

            Scanner input = new Scanner(System.in);

            int employeeNum = random.nextInt(900000) + 100000;

            String firstname;
            do {
                System.out.println("Enter Firstname: ");
                firstname = input.nextLine().trim();
            } while (firstname.length() < 2);

            String surname;
            do {
                System.out.println("Enter Surname: ");
                surname = input.nextLine().trim();
            } while (surname.length() < 2);

            Staff staff = new Staff();  // Create an instance of the Staff class

            // Get and validate the role input
            do {
                System.out.println("Enter Role (Options: Crew or Manager): ");
                staff.role = input.nextLine().trim();
            } while (!staff.role.equalsIgnoreCase("Crew") && !staff.role.equalsIgnoreCase("Manager"));

            String email = firstname.substring(0,1).toLowerCase() + surname.toLowerCase() + "@workplace.com";


            String employeeInfo = employeeNum + "," + firstname + " ," + surname + "," + staff.role + "," + email;

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

    }
    public static void removeEmployee() {

        List<String> employeeList = readEmployeeFile("src/EMS_Project/employeeDetails.txt");

        if (employeeList.isEmpty()) {
            System.out.println("No employees to remove.");
            return;
        }

        // Display the list of employees with index
        System.out.println("List of Employees:");
        for (int i = 0; i < employeeList.size(); i++) {
            String[] employeeData = employeeList.get(i).split(",");
            String firstName = employeeData[1].trim();
            String surname = employeeData[2].trim();
            int employeeId = Integer.parseInt(employeeData[0].trim());

            System.out.println((i + 1) + ". Employee ID: " + employeeId + ", Name: " + firstName + " " + surname);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the employee to remove (or 0 to cancel): ");
        int employeeToRemoveIndex = input.nextInt();

        if (employeeToRemoveIndex == 0 || employeeToRemoveIndex > employeeList.size()) {
            System.out.println("Operation canceled or invalid selection.");
            return;
        }

        // Remove the selected employee
        String removedEmployee = employeeList.remove(employeeToRemoveIndex - 1);
        String[] removedEmployeeData = removedEmployee.split(",");
        String removedEmployeeName = removedEmployeeData[1].trim() + " " + removedEmployeeData[2].trim();
        int removedEmployeeId = Integer.parseInt(removedEmployeeData[0].trim());

        System.out.println("Removed Employee: Employee ID: " + removedEmployeeId + ", Name: " + removedEmployeeName);

        // Write the updated list back to the file
        writeEmployeeFile("src/EMS_Project/employeeDetails.txt", employeeList);
        System.out.println("Employee list updated successfully.");
    }

    private static List<String> readEmployeeFile(String filePath) {
        List<String> employeeList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employeeList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading employee file: " + e.toString());
        }

        return employeeList;
    }

    private static void writeEmployeeFile(String filePath, List<String> employeeList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String employee : employeeList) {
                writer.write(employee + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing employee file: " + e.toString());
        }
    }




    // ======================================MAIN PROGRAM========================================================
    public static void main(String[] args) {


        System.out.println("Employee Management System\n");
        System.out.println("Please login\n");
        ArrayList<Staff> employees = loadFile("src/EMS_Project/employeeDetails.txt");
        login(employees);




    }
}
