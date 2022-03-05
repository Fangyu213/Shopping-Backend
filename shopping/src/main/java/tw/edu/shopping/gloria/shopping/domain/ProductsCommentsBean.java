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
@Table(name="PRODUCTSCOMMENTS")

public class ProductsCommentsBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMMENTSId")
	private Integer commentsID;
	

	@Column(name = "MESSAGES")
	private String messages;
	
	
	@Column(name = "UPDATETIME")
	private Date updatetime;
		
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

	@ManyToOne
	@JoinColumn(
		name= "PRODUCTSID",
		referencedColumnName = "productsID"		
	)
	private ProductsBean productsBean;
	
	public ProductsBean getProductsBean() {
		return productsBean;
	}

	public void setProductsBean(ProductsBean productsBean) {
		this.productsBean = productsBean;
	}
	
	

	

	public Integer getCommentsID() {
		return commentsID;
	}
	public void setCommentsID(Integer commentsID) {
		this.commentsID = commentsID;
	}
	
	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	
	
}
