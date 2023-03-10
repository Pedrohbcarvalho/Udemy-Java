package entities;

public class Company extends TaxPayer{
	
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double annualRevenue, Integer numberOfEmployees) {
		super(name, annualRevenue);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double calculateTax() {
		if (getNumberOfEmployees() > 10) {
			return getAnnualRevenue() * 0.14;
		}
		else {
			return getAnnualRevenue() * 0.16;
		}
	}

}
