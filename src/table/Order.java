package table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "order1")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer customerId;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createDate;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumns(value={ @JoinColumn(name="order_id", referencedColumnName="id")})
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Integer getId(){
		return id;
	}
	public Integer getCustomerId(){
		return customerId;
	}
	public Date getCreateDate(){
		return createDate;
	}
	public List<OrderItem> getItems(){
		return items;
	}
	
	public void setCustomerId(Integer cid) {
		customerId = cid;
	}
	public void setCreateDate(Date d) {
		createDate = d;
	}
	public void setItems(List<OrderItem> is) {
		items = is;
	}
}
