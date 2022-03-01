package tw.edu.shopping.gloria.shopping.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	@Column(name = "PRODUCTSID")
	private Integer productsID;

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

	public Integer getProductsID() {
		return productsID;
	}

	public void setProductsID(Integer productsID) {
		this.productsID = productsID;
	}

	@Override
	public String toString() {
		return "ProductsphotoBean [photoID=" + photoID + ", photo=" + photo + ", introduction=" + introduction
				+ ", uploadtime=" + uploadtime + ", productsID=" + productsID + "]";
	}


	

	
}
