package entities;

public class BankAccount {

	private int accountID;
	private String name;
	private double balance;
	private final double TAX = 5.00;
	
	public BankAccount(int accountID, String name, double balance) {
		this.accountID = accountID;
		this.name = name;
		this.balance = balance;
	}
	
	public BankAccount(int accountID, String name) {
		this.accountID = accountID;
		this.name = name;
	}

	public int getAccountID() {
		return accountID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double depositValue) {
		balance += depositValue;
	}
	
	public void withdraw(double withdrawValue) {
		balance -= (withdrawValue + TAX);
	}
	
	public String toString() {
		return "Account " + getAccountID() + ", " +
				"Holder: " + getName() + ", " +
				"Balance: $ " + getBalance();
	}
	
}
