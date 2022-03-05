package tw.edu.shopping.gloria.shopping.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="FAVORITES")
public class FavoritesBean implements Serializable{

	@EmbeddedId
	private FavoriteId favoriteId;

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME")
	private Date updatetime= new java.util.Date();
	
	
	@ManyToOne
	@JoinColumn(
		name= "USERID",
		referencedColumnName = "USERID"	
		
	)

	@MapsId("USERID")
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
	@MapsId("PRODUCTSID")
	private ProductsBean productsBean;
	
	public ProductsBean getProductsBean() {
		return productsBean;
	}

	public void setProductsBean(ProductsBean productsBean) {
		this.productsBean = productsBean;
	}
	
	
	
}
