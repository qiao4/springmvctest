package test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IOrderService;
import table.Order;
import table.OrderItem;

public class OrderTest {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		IOrderService service = (IOrderService)factory.getBean("orderService");
		Order order = new Order();
		order.setCreateDate(new Date());
		order.setCustomerId(89);
		order.getItems().add(new OrderItem("how to", 23, 6));
		order.getItems().add(new OrderItem("reading ", 128, 7));
		order.getItems().add(new OrderItem("a book", 230, 1));
		service.addOrder(order);
	}
}
