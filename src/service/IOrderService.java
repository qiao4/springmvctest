package service;

import java.util.List;

import table.Order;
import table.OrderItem;

public interface IOrderService {

	public List<OrderItem> getItems(Integer id);
	public void addOrder(Order o);
	public int getOrderCount();
	public int getCustomerOrderCount(Integer customerId);
	public List<Order> listOrders();
	
}
