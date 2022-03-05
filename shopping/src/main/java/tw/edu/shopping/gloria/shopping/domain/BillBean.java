package tw.edu.shopping.gloria.shopping.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BILL")
public class BillBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BILLID")
	private Integer billID;
	
	
	@OneToMany(mappedBy = "billBean",
			cascade = {
					CascadeType.REMOVE
			})
	private List<OrdersBean> ordersBeans;
	
	public List<OrdersBean> getOrdersBeans() {
		return ordersBeans;
	}

	
	@ManyToOne
	@JoinColumn(
		name= "USERID",
		referencedColumnName = "userID"		
	)
	private UserBean userBean;
	
	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}


	@Column(name = "PAYTIME")
	private Date paytime;
	
	
	@Column(name = "SHIPPINGRATE")
	private Integer shippingrate;
	

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
		return "BillBean [billID=" + billID + ", paytime=" + paytime + ", shippingrate="
				+ shippingrate + ", totalprice=" + totalprice + ", paid=" + paid + ", shipped="
				+ shipped + "]";
	}


	
	
	
	
	
	
}
