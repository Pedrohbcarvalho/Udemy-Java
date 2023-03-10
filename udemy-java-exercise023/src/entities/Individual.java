package entities;

public class Individual extends TaxPayer{
	
	private double healthExpenses;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double annualRevenue, double healthExpenses) {
		super(name, annualRevenue);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double calculateTax() {
		if (getAnnualRevenue() < 20000) {
			return getAnnualRevenue() * 0.15 - getHealthExpenses() * 0.5;
		}
		else {
			return getAnnualRevenue() * 0.25 - getHealthExpenses() * 0.5;
		}		
	}

}
