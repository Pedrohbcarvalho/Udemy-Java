package entities;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double dollarToReaisConverter(double dollarPrice, double dollarAmount) {
		return (dollarPrice * dollarAmount) + (dollarPrice * dollarAmount * IOF);
	}
}
