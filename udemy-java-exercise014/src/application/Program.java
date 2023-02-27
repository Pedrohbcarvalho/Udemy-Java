package application;

import java.util.Scanner;

import entities.Employee;

public class Program {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();
	
		System.out.println("Please inform your name, gross salary and tax:");
		employee.name = scanner.nextLine();
		employee.grossSalary = scanner.nextDouble();
		employee.tax = scanner.nextDouble();
	
		System.out.printf("Employee: %s%n", employee);
	
		System.out.printf("Which percentage to increase salary? ");
		double percentage = scanner.nextDouble();
		employee.increaseSalary(percentage);
	
		System.out.printf("Updated data: %s%n", employee);
	
		scanner.close();
	}
}
