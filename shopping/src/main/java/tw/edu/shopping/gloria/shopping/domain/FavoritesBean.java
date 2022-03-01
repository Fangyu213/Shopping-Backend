package tw.edu.shopping.gloria.shopping.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FAVORITES")
public class FavoritesBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer ID;
	
	

	@Column(name = "USERID")
	private Integer userID;
	
	@Column(name = "PRODUCTSID")
	private Integer productsid;
	
	
	@Column(name = "UPDATETIME")
	private Date updatetime;
}
