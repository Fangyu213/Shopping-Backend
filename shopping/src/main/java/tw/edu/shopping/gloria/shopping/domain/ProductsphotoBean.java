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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="PRODUCTSPHOTO")
public class ProductsphotoBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PHOTOID")
	private Integer photoID;
	
	@Column(name = "PHOTO")
	private String photo;
	
	@Column(name ="INTRODUCTION")
	private String introduction;
	

	@Column(name = "UPLOADTIME")
	private Date uploadtime;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(
			name = "PRODUCTSID",
			referencedColumnName = "productsid"
			)
	private ProductsBean productsbean;
	
	public ProductsBean getProductsbean() {
		return productsbean;
	}

	public void setProductsbean(ProductsBean productsbean) {
		this.productsbean = productsbean;
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
	public Integer getPhotoID() {
		return photoID;
	}
	public void setPhotoID(Integer photoID) {
		this.photoID = photoID;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Date getUploadtime() {
		return uploadtime;
	}

	public void setUploadtime(Date uploadtime) {
		this.uploadtime = uploadtime;
	}


	
}
