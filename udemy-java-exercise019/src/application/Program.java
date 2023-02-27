package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.printf("Inform how many employees will be registered: ");
		int registration = input.nextInt();
		
		for (int i=0; i<registration; i++) {	
			System.out.printf("Employee #%d:%n", i+1);
			System.out.printf("Id: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.printf("Name: ");
			String name = input.nextLine();
			System.out.printf("Salary: ");
			double salary = input.nextDouble();
			Employee employeeReg = new Employee(id, name, salary);
			employeeList.add(employeeReg);
			System.out.printf("%n");
		}
		
		System.out.printf("Enter the employee id that will have salary increase: ");
		int id = input.nextInt();
		boolean existId = false;
		for (Employee employee : employeeList) {
			if (employee.getId() == id)
				existId = true;
		}
		if(!existId) 
			System.out.printf("This id does not exist!%n");
		else {
			System.out.printf("Enter the percentage: ");
			double salaryIncrease = input.nextDouble()/100;
			for (Employee employee : employeeList) {
				if (employee.getId() == id) {
					employee.setSalary(employee.getSalary() + (employee.getSalary() * salaryIncrease));
				}
			}
		}
		
		System.out.printf("%nList of employees:%n");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		input.close();
	}

}
