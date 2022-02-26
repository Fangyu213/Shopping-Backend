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
	@Column(name = "Id")
	private Integer id;
	

	

	@Column(name = "PHOTO")
	private String photo;
	
	@Column(name ="INTRODUCTION")
	private String introduction;
	

	@Column(name = "UPLOADTIME")
	private Date uploadtime;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "ProductsphotoBean [id=" + id + ", photo=" + photo + ", introduction=" + introduction + ", uploadtime="
				+ uploadtime + "]";
	}


	
}
