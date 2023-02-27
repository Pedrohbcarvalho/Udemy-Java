import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startTime = scanner.nextInt();
		int endTime = scanner.nextInt();
		if (startTime > endTime) {
			System.out.printf("The match duration was %d hour(s)", endTime + 24 - startTime);
		} else if (startTime < endTime) {
			System.out.printf("The match duration was %d hour(s)", endTime - startTime);
		} else
			System.out.println("The match duration was 24 hours");

		scanner.close();
	}

}
