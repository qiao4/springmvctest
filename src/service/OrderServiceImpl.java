package service;

import java.util.List;

import dao.IOrderDao;
import orm.ICatDao;
import table.Order;
import table.OrderItem;

public class OrderServiceImpl implements IOrderService {
	
	private IOrderDao orderDao;
	
	public IOrderDao getOrderDao(){
		return orderDao;
	}
	public void setOrderDao(IOrderDao dao) {
		orderDao = dao;
	}

	@Override
	public List<OrderItem> getItems(Integer id) {
		// TODO Auto-generated method stub
		return orderDao.getItems(id);
	}

	@Override
	public void addOrder(Order o) {
		// TODO Auto-generated method stub

		orderDao.addOrder(o);
	}

	@Override
	public int getOrderCount() {
		// TODO Auto-generated method stub
		return orderDao.getOrderCount();
	}

	@Override
	public int getCustomerOrderCount(Integer customerId) {
		// TODO Auto-generated method stub
		return getCustomerOrderCount(customerId);
	}

	@Override
	public List<Order> listOrders() {
		// TODO Auto-generated method stub
		return orderDao.listOrders();
	}

}
