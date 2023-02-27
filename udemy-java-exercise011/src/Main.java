import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int senha = scanner.nextInt();

		while (senha != 2002) {
			System.out.println("Invalid password");
			senha = scanner.nextInt();

		}
		System.out.println("Acess allowed");
		scanner.close();
	}

}
