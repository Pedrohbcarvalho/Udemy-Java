import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int part1ID = scanner.nextInt();
		int part1Quantity = scanner.nextInt();
		double part1Price = scanner.nextDouble();
		
		int part2ID = scanner.nextInt();
		int part2Quantity = scanner.nextInt();
		double part2Price = scanner.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", (part1Quantity * part1Price) + (part2Quantity * part2Price));
		
		scanner.close();
	}

}
