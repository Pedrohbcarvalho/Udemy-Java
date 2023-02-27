package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		System.out.printf("How many people's data will be stored? ");
		int numberOfPeople = input.nextInt();
		Person[] personVector = new Person[numberOfPeople];
		
		for (int i=0; i<personVector.length; i++) {
			System.out.printf("Inform the data of the %d person: %n", i+1);
			input.nextLine();
			String name = input.nextLine();
			double age = input.nextInt();
			double height = input.nextDouble();
			personVector[i] = new Person(name, age, height);
		}
		
		double totalHeight = 0.0;		
		double youngerThanSixteen = 0.0;
		
		for (int i=0; i<personVector.length; i++) {
			totalHeight += personVector[i].getHeight();
			if (personVector[i].getAge() < 16)
				youngerThanSixteen++;
		}
		
		System.out.printf("Average height: %.2f%n", totalHeight/numberOfPeople);
		System.out.printf("Percentage of people younger than 16: %.1f %n", youngerThanSixteen/numberOfPeople * 100);
		
		for (int i=0; i<personVector.length; i++) {
			if (personVector[i].getAge() < 16)
				System.out.printf("%s%n", personVector[i].getName());
		}
		
		input.close();
	}

}
