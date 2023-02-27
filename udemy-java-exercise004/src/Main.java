import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double raio = scanner.nextDouble();
		System.out.printf("A area do circulo e: %.4f%n", Math.pow(raio, 2) * 3.14159);
		
		scanner.close();
	}

}
