
import java.util.Scanner;

public class EmailGenerator {
    public static Employee employee;

    public static void UserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, you will be provided with a company email today, please press enter then follow the instructions below");
        scanner.nextLine();
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter Department: ");
        String department = scanner.nextLine();

        
        employee = new Employee(firstName, lastName, department);
    }

    public static void main(String[] args) {
        UserInput();
        System.out.println("Your company email is: " + employee.getFN() + employee.getLN() + "@" + employee.getDPT() + "-techvista.com");
        System.out.println("Welcome on board!");
    }
}
