package application;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.printf("How many employees will be registered? ");
		Integer numberOfEmployeesReg = input.nextInt();
		
		for (int i=0; i<numberOfEmployeesReg; i++) {
			System.out.printf("Employee #%d:", i+1);
			System.out.printf("%nID: ");
			Integer id = input.nextInt();
			input.nextLine();
			System.out.printf("Name: ");
			String name = input.nextLine();
			System.out.printf("Salary: ");
			Double salary = input.nextDouble();			
			Employee employee = new Employee(id, name, salary);
			employeeList.add(employee);
			System.out.printf("%n");					
		}
		
		System.out.printf("Enter the employee id that will have salary increase: ");
		int employeeId = input.nextInt();
		boolean employeeExists = false;
		
		for (Employee employee : employeeList) {
			if (employee.getId() == employeeId) {
				employeeExists = true;
			}
		}
		
		if (!employeeExists) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.printf("Enter the percentage: ");
			double percentage = input.nextDouble();
			for (Employee employee : employeeList) {
				if (employee.getId() == employeeId) {
					employee.setSalary(employee.getSalary() + employee.getSalary()*percentage/100);
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
