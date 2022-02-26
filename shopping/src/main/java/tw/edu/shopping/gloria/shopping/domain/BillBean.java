package tw.edu.shopping.gloria.shopping.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BILL")
public class BillBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	

	@Column(name = "ORDER")
	private String order;
	
	@Column(name = "PAYTIME")
	private Date paytime;
	
	
	@Column(name = "SHIPPINGRATE")
	private Integer shippingrate;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getOrder() {
		return order;
	}


	public void setOrder(String order) {
		this.order = order;
	}


	public Date getPaytime() {
		return paytime;
	}


	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}


	public Integer getShippingrate() {
		return shippingrate;
	}


	public void setShippingrate(Integer shippingrate) {
		this.shippingrate = shippingrate;
	}


	@Override
	public String toString() {
		return "BillBean [id=" + id + ", order=" + order + ", paytime=" + paytime + ", shippingrate=" + shippingrate
				+ "]";
	}
	
	
	
	
	
}
