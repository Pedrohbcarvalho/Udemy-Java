package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<TaxPayer> taxPayerList = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int numberOfTaxPayers = input.nextInt();
		
		for (int i=1; i<=numberOfTaxPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char taxType = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = input.nextDouble();
			if (taxType == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = input.nextDouble();
				TaxPayer taxPayer = new Individual(name, annualIncome, healthExpenditures);
				taxPayerList.add(taxPayer);
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = input.nextInt();
				TaxPayer taxPayer = new Company(name, annualIncome, numberOfEmployees);
				taxPayerList.add(taxPayer);
			}	
		}
		
		System.out.printf("%nTAXES PAID:%n");
		double totalTaxes = 0.0;
		for (TaxPayer taxPayer : taxPayerList) {
			System.out.println(taxPayer.getName() + ": $" + String.format("%.2f", taxPayer.calculateTax()));
			totalTaxes += taxPayer.calculateTax();				
		}
		
		System.out.printf("%nTOTAL TAXES: $%.2f", totalTaxes);
		input.close();
	}

}
