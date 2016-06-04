package table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "order_items")
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String itemName;
	private Integer price;
	private Integer number;
	
	public OrderItem(){
		
	}
	public OrderItem(String nString , int p, int n) {
		itemName = nString;
		price = p;
		number = n;
	}
	public String getItemName(){
		return itemName;
	}
	public Integer getPrice(){
		return price;
	}
	public Integer getNumber(){
		return number;
	}
	public Integer getId(){
		return id;
	}
	
	public void setItemName(String n) {
		itemName = n;
	}
	public void setPrice(Integer p) {
		price = p;
	}
	public void setNumber(Integer n) {
		number = n;
	}
}
