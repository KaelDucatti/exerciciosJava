package lista05.applications;

import java.util.Scanner;
import lista05.entities.ex04_Employee;

public class ex04_MainEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ex04_Employee employee;
        employee = new ex04_Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println();
        System.out.print(employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data");
        System.out.print(employee);

        scanner.close();
    }
}
