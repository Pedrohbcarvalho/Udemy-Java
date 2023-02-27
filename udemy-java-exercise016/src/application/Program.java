package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the dollar price?");
		double dollarPrice = scanner.nextDouble();
		System.out.println("How many dollars will be bought?");
		double dollarAmount = scanner.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.dollarToReaisConverter(dollarPrice, dollarAmount));
		
		scanner.close();
	}

}
