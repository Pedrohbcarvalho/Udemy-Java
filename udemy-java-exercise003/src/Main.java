import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.printf("%d + %d = %d%n", x, y, x + y);
		
		scanner.close();
	}

}
