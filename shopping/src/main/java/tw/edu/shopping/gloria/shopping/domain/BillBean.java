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
	@Column(name = "BILLId")
	private Integer billID;
	
	

	@Column(name = "ORDERSID")
	private Integer ordersID;
	
	@Column(name = "PAYTIME")
	private Date paytime;
	
	
	@Column(name = "SHIPPINGRATE")
	private Integer shippingrate;
	
	@Column(name = "USERID")
	private Integer userID;
	
	@Column(name = "TOTALPRICE")
	private Integer totalprice;
	
	@Column(name = "PAID")
	private Integer paid;
	
	
	@Column(name = "SHIPPED")
	private boolean shipped;


	public Integer getBillID() {
		return billID;
	}


	public void setBillID(Integer billID) {
		this.billID = billID;
	}


	public Integer getOrdersID() {
		return ordersID;
	}


	public void setOrdersID(Integer ordersID) {
		this.ordersID = ordersID;
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


	public Integer getUserID() {
		return userID;
	}


	public void setUserID(Integer userID) {
		this.userID = userID;
	}


	public Integer getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(Integer totalprice) {
		this.totalprice = totalprice;
	}


	public Integer getPaid() {
		return paid;
	}


	public void setPaid(Integer paid) {
		this.paid = paid;
	}


	public boolean isShipped() {
		return shipped;
	}


	public void setShipped(boolean shipped) {
		this.shipped = shipped;
	}


	@Override
	public String toString() {
		return "BillBean [billID=" + billID + ", ordersID=" + ordersID + ", paytime=" + paytime + ", shippingrate="
				+ shippingrate + ", userID=" + userID + ", totalprice=" + totalprice + ", paid=" + paid + ", shipped="
				+ shipped + "]";
	}


	
	
	
	
	
	
}
