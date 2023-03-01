package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.OrderStatus;

public class Client {
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private String email;
	private Date birthDate;
	private Order order;
	
	public Client(String name, String email, Date birthDate, Date moment, OrderStatus status) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		order = new Order(moment, status);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(name + " ");
		stringBuilder.append(dateFormat.format(birthDate) + " - ");
		stringBuilder.append(email);
		
		return stringBuilder.toString();
	}
	
}
