package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import table.Order;
import table.OrderItem;

public class OrderDaoImpl extends HibernateDaoSupport implements IOrderDao {

	@Override
	public List<OrderItem> getItems(Integer id) {
		// TODO Auto-generated method stub
		//List<OrderItem> list = getHibernateTemplate().find(queryString)
		List<Order> o = getHibernateTemplate().find("from Order o where o.id = ?", id);
		if (o.size() > 0) {
			Order order = o.get(0);
			return order.getItems();
		}
		return null;
	}
	
	@Override
	public int getOrderCount() {
		// TODO Auto-generated method stub
		Number number = (Number)getHibernateTemplate().find("select count(o) from Order o").get(0);
		return number.intValue();
	}
	
	@Override
	public int getCustomerOrderCount(Integer customerId) {
		// TODO Auto-generated method stub
		Number number = (Number)getHibernateTemplate().find("select count(o) from Order o where o.customerId = ?", customerId).get(0);
		return number.intValue();
	}
	
	@Override
	public void addOrder(Order o) {
		// TODO Auto-generated method stub
		getHibernateTemplate().persist(o);
	}
	
	@Override
	public List<Order> listOrders() {
		// TODO Auto-generated method stub
		List<Order> orders = getHibernateTemplate().find("from Order");
		return orders;
	}
}
