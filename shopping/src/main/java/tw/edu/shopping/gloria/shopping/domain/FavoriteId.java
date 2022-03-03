package tw.edu.shopping.gloria.shopping.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class FavoriteId implements Serializable{
	@Column(name = "USERID")
	private Integer userID;
	
	@Column(name = "PRODUCTSID")
	private Integer productsid;
	
	public FavoriteId() {
		
	}

	public FavoriteId(Integer userID, Integer productsid) {
		this.userID = userID;
		this.productsid = productsid;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getProductsid() {
		return productsid;
	}

	public void setProductsid(Integer productsid) {
		this.productsid = productsid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productsid, userID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FavoriteId other = (FavoriteId) obj;
		return Objects.equals(productsid, other.productsid) && Objects.equals(userID, other.userID);
	}
	
}
