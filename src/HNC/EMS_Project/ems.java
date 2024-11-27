package EMS_Project;


import java.util.*;
import java.io.*;

// Employee Management System (EMS) class to manage staff within an organisation

public class ems {

    //This displays the manager menu for users with admin privileges like managers
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

    //This menu is for normal staff with less privileges
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

    // This loads employee details from a text file

    public static ArrayList<Staff> loadFile(String filename) {
        List<String> staffDetails;
        ArrayList<Staff> thisStaff = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            String line = in.readLine();
            while (line != null) {
                if (!line.trim().isEmpty()) {
                    staffDetails = Arrays.asList(line.split(","));
                    if (staffDetails.size() == 5) {
                        Staff newStaff = new Staff();
                        newStaff.employeeId = Integer.parseInt(staffDetails.get(0).trim());
                        newStaff.firstname = staffDetails.get(1).trim();
                        newStaff.surname = staffDetails.get(2).trim();
                        newStaff.role = staffDetails.get(3).trim();
                        String email = newStaff.firstname.substring(0, 1).toLowerCase() + newStaff.surname.toLowerCase() + "@workplace.com";
                        newStaff.email = email;
                        thisStaff.add(newStaff);
                    } else {
                        System.out.println("Invalid line format: " + line);
                    }
                }
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading from file: " + e.toString());
        }
        return thisStaff;
    }

    //This handles the login process for this program
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
                return;
            } else {
                System.out.println("Login failed. Invalid email or password. Attempts left: " + (maxLoginAttempts - loginAttempts - 1));
                loginAttempts++;
            }

        } while (loginAttempts < maxLoginAttempts);

        System.out.println("Maximum login attempts reached. Exiting the program.");
    }

    //Authenticates the user and allows them to login if the correct credentials are used.
    private static String authenticateUser(String enteredUsername, String enteredPassword) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/EMS_Project/employeeDetails.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                String storedUsername = employeeData[4].trim();
                String storedPassword = employeeData[1].trim();

                if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
                    return employeeData[3].trim();
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading employee details file: " + e.getMessage());
        }

        return null;
    }

    //This reads data from the text file and adds it in to an employee list which prints out all the staff member names
    public static void displayEmployee(ArrayList<Staff> employees) {

        List<String> employeeList = readEmployeeFile("src/EMS_Project/employeeDetails.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader("src/EMS_Project/employeeDetails.txt"))) {
            int staffCount = 0;

            while (reader.readLine() != null) {
                staffCount++;
            }

            System.out.println("We currently have " + staffCount + " members of staff\n");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }


            System.out.println("List of Employees:");
            for (int i = 0; i < employeeList.size(); i++) {
                String[] employeeData = employeeList.get(i).split(",");
                String firstName = employeeData[1].trim();
                String surname = employeeData[2].trim();
                int employeeId = Integer.parseInt(employeeData[0].trim());

                System.out.println(firstName + " " + surname);
            }

        System.out.println("");
    }

    // This adds employees asking for their name and surname. A Id number is generated and a work email is also created.
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

            Staff staff = new Staff();


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

    // This allows users with admin access to remove employees by choosing an index from a list
    public static void removeEmployee() {

        List<String> employeeList = readEmployeeFile("src/EMS_Project/employeeDetails.txt");

        if (employeeList.isEmpty()) {
            System.out.println("No employees to remove.");
            return;
        }


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


        String removedEmployee = employeeList.remove(employeeToRemoveIndex - 1);
        String[] removedEmployeeData = removedEmployee.split(",");
        String removedEmployeeName = removedEmployeeData[1].trim() + " " + removedEmployeeData[2].trim();
        int removedEmployeeId = Integer.parseInt(removedEmployeeData[0].trim());

        System.out.println("Removed Employee: Employee ID: " + removedEmployeeId + ", Name: " + removedEmployeeName);


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




    // =============================================MAIN PROGRAM========================================================
    public static void main(String[] args) {


        System.out.println("Employee Management System\n");
        System.out.println("Please login\n");
        ArrayList<Staff> employees = loadFile("src/EMS_Project/employeeDetails.txt");
        login(employees);




    }
}
