package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		System.out.println("Enter client data:");
		System.out.printf("Name: ");
		String name = input.nextLine();
		System.out.printf("Email: ");
		String email = input.nextLine();
		System.out.printf("Birth date (DD/MM/YYYY): ");
		String birthDate = input.nextLine();
		Date birthDateConverted = dateFormat.parse(birthDate);
		System.out.println("Enter order data: ");
		System.out.printf("Status: ");
		String status = input.nextLine();
		System.out.printf("How many items to this order? ");
		Integer itemQuantity = input.nextInt();
		Client client = new Client(name, email, birthDateConverted,
								date, OrderStatus.valueOf(status));
		
		for (int i=0; i<itemQuantity; i++) {
			System.out.printf("Enter #%d item data: ", i+1);
			input.nextLine();
			System.out.printf("%nProduct name: ");
			String productName = input.nextLine();
			System.out.printf("Product price: ");
			Double productPrice = input.nextDouble();
			System.out.printf("Quantity: ");
			Integer quantity = input.nextInt();
			Product product = new Product(productName, productPrice);
			OrderItem order = new OrderItem(quantity, product);
			client.getOrder().addItem(order);
		}
		
		System.out.printf("%nORDER SUMMARY:%n");
		System.out.printf("Order moment: %s", client.getOrder().getMoment());
		System.out.printf("%nOrder status: %s", client.getOrder().getStatus());
		System.out.printf("%nClient: %s", client.toString());
		System.out.printf("%nORDER ITEMS:%n");
		for (OrderItem orderItem : client.getOrder().getOrderItemList()) {
			System.out.print(orderItem.getProduct());
			System.out.println(orderItem);
		}
		
		System.out.printf("Total Price: $%.2f", client.getOrder().total());	
		
		input.close();
	}

}
