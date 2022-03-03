package tw.edu.shopping.gloria.shopping.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public abstract class OrdersBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDERSID")
	private Integer ordersID;
	
	

	@Column(name = "PRODUCTSID")
	private Integer productsID;
	
	
	@Column(name = "NUMBER")
	private Integer number;
	
	@Column(name = "ODERTIME")
	private Date ordertime;
	
	@ManyToOne
	@JoinColumn(
		name= "BILLID",
		referencedColumnName = "BILLID"		
	)
	private BillBean billBean;

	public BillBean getBillBean() {
		return billBean;
	}

	public void setBillBean(BillBean billBean) {
		this.billBean = billBean;
	}

	@Column(name = "USERID")
	private Integer userID;
	
	
	
	public Integer getOrdersID() {
		return ordersID;
	}

	public void setOrdersID(Integer ordersID) {
		this.ordersID = ordersID;
	}

	public Integer getProductsID() {
		return productsID;
	}

	public void setProductsID(Integer productsID) {
		this.productsID = productsID;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "OdersBean [ordersID=" + ordersID + ", productsID=" + productsID + ", number=" + number + ", ordertime="
				+ ordertime + ", userID=" + userID + "]";
	}

	

}
