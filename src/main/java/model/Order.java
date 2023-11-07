package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idOrder")
	private Long idOrder;
	
	@Column(name="order_date", nullable=false)
	private String order_date;
	
	@Column(name="order_status", nullable=false)
	private String order_status;
	
	@OneToMany(mappedBy="order")
	private Set <OrderProducts> productsOrder;
	
	
	public Order() {
	
	}
	
	public Order(Long idOrder, String order_date, String order_satus) {
		super();
		this.idOrder = idOrder;
		this.order_date = order_date;
		this.order_status = order_satus;
	}
	public Long getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getOrder_satus() {
		return order_status;
	}
	public void setOrder_satus(String order_satus) {
		this.order_status = order_satus;
	}
	@Override
	public String toString() {
		return "Order [idOrder=" + idOrder + ", order_date=" + order_date + ", order_satus=" + order_status + "]";
	}


}
