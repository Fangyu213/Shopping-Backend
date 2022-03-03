package tw.edu.shopping.gloria.shopping.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
}
