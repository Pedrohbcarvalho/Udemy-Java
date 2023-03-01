package entities;

import java.util.List;
import java.util.ArrayList;

import entities.Product;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
	
	public Double subTotal() {
		return quantity * price;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Quantity: " + quantity);
		stringBuilder.append(", Subtotal: $" + String.format("%.2f", subTotal()));
		
		return stringBuilder.toString();
	}

}
