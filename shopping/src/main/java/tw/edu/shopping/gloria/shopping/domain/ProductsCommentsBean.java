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
	@Column(name = "Id")
	private Integer id;
	
	

	@Column(name = "USERID")
	private String userid;
	
	@Column(name = "MESSAGES")
	private String messages;
	
	
	@Column(name = "UPDATETIME")
	private Date updatetime;
}
