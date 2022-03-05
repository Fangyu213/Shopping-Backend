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
	
	@ManyToOne
	@JoinColumn(
		name= "USERID",
		referencedColumnName = "USERID"		
	)
	private UserBean userBean;
	
	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	
	@ManyToOne
	@JoinColumn(
		name= "PRODUCTSID",
		referencedColumnName = "PRODUCTSID"		
	)
	private ProductsBean productsBean;
	
	public ProductsBean getProductsBean() {
		return productsBean;
	}

	public void setProductsBean(ProductsBean productsBean) {
		this.productsBean = productsBean;
	}
	
	
	

	public Integer getOrdersID() {
		return ordersID;
	}

	public void setOrdersID(Integer ordersID) {
		this.ordersID = ordersID;
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


	@Override
	public String toString() {
		return "OdersBean [ordersID=" + ordersID + ", number=" + number + ", ordertime="
				+ ordertime + "]";
	}

	

}
