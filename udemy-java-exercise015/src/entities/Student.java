package entities;

import java.util.Scanner;

public class Student {
	
	public String name;
	public double grade1, grade2, grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public void hasPassed(double finalGrade) {
		if (finalGrade < 60)
			System.out.printf("FAILED%nMISSING %.2f POINTS%n", 60 - finalGrade);
		else 
			System.out.println("PASSED");
	}
}
