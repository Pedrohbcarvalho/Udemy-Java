import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
		System.out.printf("TRIANGULO: %.3f%n", (num1 * num3) / 2);
		System.out.printf("CIRCULO: %.3f%n", Math.pow(num3, 2) * 3.141519);
		System.out.printf("TRAPEZIO: %.3f%n", ((num1 + num2) * num3) / 2);
		System.out.printf("QUADRADO: %.3f%n", Math.pow(num2, 2));
		System.out.printf("RETANGULO: %.3f%n", num1 * num2);
		scanner.close();
	}

}
