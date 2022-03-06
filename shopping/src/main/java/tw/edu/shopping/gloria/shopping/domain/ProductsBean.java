package tw.edu.shopping.gloria.shopping.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="PRODUCTS")
public class ProductsBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCTSId")
	private Integer productsID;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "PRICE")
	private Integer price;
	
	@JsonIgnore
	@OneToMany(mappedBy = "productsbean",
			cascade = {
					CascadeType.REMOVE
			})
	private List<ProductsphotoBean> productphotobeans;
	
	public List<ProductsphotoBean> getProductphotobeans() {
		return productphotobeans;
	}

	public void setProductphotobeans(List<ProductsphotoBean> productphotobeans) {
		this.productphotobeans = productphotobeans;
	}
	
	
	@Column(name = "INTRODUCTION")
	private String introduction;
	
	@Column(name = "STORAGE")
	private Integer storage;
	
	
	@OneToMany(mappedBy = "productsBean",
			cascade = {
					CascadeType.REMOVE
			})
	private List<OrdersBean> ordersBean;
	
	public List<OrdersBean> getOrdersBean() {
		return ordersBean;
	}

	public void setOrdersBean(List<OrdersBean> ordersBean) {
		this.ordersBean = ordersBean;
	}

	
	@OneToMany(mappedBy = "productsBean",
			cascade = {
					CascadeType.REMOVE
			})
	private List<ProductsphotoBean> productsphotoBean;
	
	
	
	public List<ProductsphotoBean> getProductsphotoBean() {
		return productsphotoBean;
	}

	public void setProductsphotoBean(List<ProductsphotoBean> productsphotoBean) {
		this.productsphotoBean = productsphotoBean;
	}

	@OneToMany(mappedBy = "productsBean",
			cascade = {
					CascadeType.REMOVE
			})
	private List<ProductsCommentsBean> productsCommentsBean;
	
	public List<ProductsCommentsBean> getProductsCommentsBean() {
		return productsCommentsBean;
	}

	public void setProductsCommentsBean(List<ProductsCommentsBean> productsCommentsBean) {
		this.productsCommentsBean = productsCommentsBean;
	}

	
	@OneToMany(mappedBy = "productsBean",
			cascade = {
					CascadeType.REMOVE
			})
	private List<FavoritesBean> favoritesBean;
	
	public List<FavoritesBean> getFavoritesBean() {
		return favoritesBean;
	}

	public void setFavoritesBean(List<FavoritesBean> favoritesBean) {
		this.favoritesBean = favoritesBean;
	}

	public Integer getProductsID() {
		return productsID;
	}

	public void setProductsID(Integer productsID) {
		this.productsID = productsID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Integer getStorage() {
		return storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

}
