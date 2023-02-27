import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfLines = scanner.nextInt();

		for (int i = 1; i <= numberOfLines; i++) {
			System.out.printf("%d %d %d%n", i, i * i, i * i * i);
		}

		scanner.close();
	}

}
