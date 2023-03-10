package application;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Please inform the year: ");
		String year = input.nextLine();
		System.out.printf("Please inform the month: ");
		String month = input.nextLine();
		System.out.printf("Please inform the day: ");
		String day = input.nextLine();
		System.out.printf("Please inform the hour (hours:minutes): ");
		String hour = input.nextLine();
		
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Instant informedDate = Instant.parse(year+"-"+month+"-"+day+"T"+hour+":00-03:00");
		LocalDateTime userDate = LocalDateTime.ofInstant(informedDate, ZoneId.systemDefault());
		LocalDateTime japanDate = LocalDateTime.ofInstant(informedDate, ZoneId.of("Japan"));
		LocalDateTime utc0 = LocalDateTime.ofInstant(informedDate, ZoneId.of("Greenwich"));
		
		System.out.printf("%nUser's time: " + userDate.format(timeFormatter));
		System.out.printf("%nJapan's time: " + japanDate.format(timeFormatter));
		System.out.printf("%nGreenwich's time: " + utc0.format(timeFormatter));
			
		input.close();
	}

}
