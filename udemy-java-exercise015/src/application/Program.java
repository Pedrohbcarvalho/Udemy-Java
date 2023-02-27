package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Please inform your name and your grades");

		student.name = scanner.nextLine();
		student.grade1 = scanner.nextDouble();
		student.grade2 = scanner.nextDouble();
		student.grade3 = scanner.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		student.hasPassed(student.finalGrade());

		scanner.close();
	}

}
