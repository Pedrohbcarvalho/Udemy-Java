import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		int code = 0;
		
		while (code != 4) {
			code = scanner.nextInt();
			switch (code) {
			case 1:
				alcohol += 1;
				break;
				
			case 2:
				gasoline += 1;
				break;
				
			case 3:
				diesel += 1;
				break;
			
			case 4: 
				break; 
				
			default:
				System.out.println("The code you informed is invalid, try again: ");
				break;
			}
			
		}
		
		System.out.printf("Thank you%nAlcohol: %d%nGasoline: %d%nDiesel: %d%n", alcohol, gasoline, diesel);
		scanner.close();
	}

}
