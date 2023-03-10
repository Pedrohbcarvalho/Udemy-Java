package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Product> productList = new ArrayList<>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = input.nextInt();
		
		for (int i=1; i<=numberOfProducts; i++) {
			System.out.println("Product #" + i + " Data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = input.next().charAt(0);
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Price: ");
			double price = input.nextDouble();
			
			if (productType == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = input.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFee));
			}
			
			else if (productType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				input.nextLine();
				String stringDate = input.nextLine();
				Date date = dateFormat.parse(stringDate);
				productList.add(new UsedProduct(name, price, date));
			}
			
			else {
				productList.add(new Product(name, price));
			}
		}
		
		System.out.printf("%nPRICE TAGS:%n");
		
		for (Product product : productList) {
			System.out.println(product.priceTag());
		}
		
		input.close();
	}

}
