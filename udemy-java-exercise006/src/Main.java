import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int workHours = scanner.nextInt();
		double salaryHour = scanner.nextDouble();
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", number, workHours * salaryHour);
		
		scanner.close();
	}

}
