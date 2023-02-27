package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter account number: ");
		int accountID = scanner.nextInt();
		System.out.printf("Enter account holder: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.printf("Is there an initial deposit (y/n)? ");
		char confirmation = scanner.next().charAt(0);
		
		BankAccount userAccount;
		
		if (confirmation == 'n' || confirmation == 'N') {
			userAccount = new BankAccount(accountID, name);
		}	
		else {
			System.out.printf("Enter initial deposit value: ");
			double initialDeposit = scanner.nextDouble();
			userAccount = new BankAccount(accountID, name, initialDeposit);	
		}
		
		System.out.printf("%nAccount data:%n%s%n", userAccount);
		
		System.out.printf("%nEnter a deposit value: ");
		double depositwithdrawValue = scanner.nextDouble();
		userAccount.deposit(depositwithdrawValue);
		System.out.printf("Update account data:%n%s%n", userAccount);
		
		System.out.printf("%nEnter a withdraw value: ");
		depositwithdrawValue = scanner.nextDouble();
		userAccount.withdraw(depositwithdrawValue);
		System.out.printf("Updated account data:%n%s%n", userAccount);
		
		scanner.close();	
		
	}
}
