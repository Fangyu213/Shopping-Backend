package tw.edu.shopping.gloria.shopping.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



	@Entity
	@Table(name="USER")
	public class UserBean {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "USERID")
		private Integer userID;
		
	
		@Column(name = "NAME")
		private String name;
		
		
		@Column(name = "PASSWORD")
		private String password;
		
		
		@Column(name = "NICKNAME")
		private String nickname;
		
		@Column(name = "GENDER")
		private String gender;
		
		@Column(name = "BIRTHDAY")
		private Date birthday;
		
		@Column(name = "PHONE")
		private String phone;
		
		@Column(name = "ADDRESS")
		private String address;
		
		
		@Column(name = "EMAIL")
		private String email;
		
		@Column(name = "CREDITCARDS")
		private String creditcards;
		
		
		@OneToMany(mappedBy = "userBean",
				cascade = {
						CascadeType.REMOVE
				})
		private List<BillBean> billBean;
		
		public List<BillBean> getBillBean() {
			return billBean;
		}
		public void setBillBean(List<BillBean> billBean) {
			this.billBean = billBean;
		}
		
		@OneToMany(mappedBy = "userBean",
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
//		
//		@OneToMany(mappedBy = "userBean",
//				cascade = {
//						CascadeType.REMOVE
//				})
//		private List<FavoritesBean> favoritesBean;
//
//		public List<FavoritesBean> getFavoritesBean() {
//			return favoritesBean;
//		}
//		public void setFavoritesBean(List<FavoritesBean> favoritesBean) {
//			this.favoritesBean = favoritesBean;
//		}
	
		
		@OneToMany(mappedBy = "userBean",
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
		public Integer getUserID() {
			return userID;
		}
		public void setUserID(Integer userID) {
			this.userID = userID;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getNickname() {
			return nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCreditcards() {
			return creditcards;
		}

		public void setCreditcards(String creditcards) {
			this.creditcards = creditcards;
		}

		
		

	}


