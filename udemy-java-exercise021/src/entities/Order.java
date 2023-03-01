package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> orderItemList = new ArrayList<>();
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	public String getMoment() {
		return dateFormat.format(moment);
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		orderItemList.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItemList.remove(item);
	}
	
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public Double total() {
		Double total = 0.00;
		for (OrderItem orderItem : orderItemList) {
			total += orderItem.subTotal();
		}
		return total;
	}
		
}
