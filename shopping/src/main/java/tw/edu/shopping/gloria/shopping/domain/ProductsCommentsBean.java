package tw.edu.shopping.gloria.shopping.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTSCOMMENTS")

public class ProductsCommentsBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMMENTSId")
	private Integer commentsID;
	
	

	@Column(name = "USERID")
	private Integer userID;
	
	@Column(name = "MESSAGES")
	private String messages;
	
	
	@Column(name = "UPDATETIME")
	private Date updatetime;
	
	@Column(name = "PRODUCTSID")
	private Integer productsID;

	public Integer getCommentsID() {
		return commentsID;
	}

	public void setCommentsID(Integer commentsID) {
		this.commentsID = commentsID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
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

	public Integer getProductsID() {
		return productsID;
	}

	public void setProductsID(Integer productsID) {
		this.productsID = productsID;
	}

	@Override
	public String toString() {
		return "ProductsCommentsBean [commentsID=" + commentsID + ", userID=" + userID + ", messages=" + messages
				+ ", updatetime=" + updatetime + ", productsID=" + productsID + "]";
	}
	
	
}
