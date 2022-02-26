package tw.edu.shopping.gloria.shopping;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tw.edu.shopping.gloria.shopping.domain.BillBean;
import tw.edu.shopping.gloria.shopping.domain.FavoritesBean;
import tw.edu.shopping.gloria.shopping.domain.OdersBean;
import tw.edu.shopping.gloria.shopping.domain.ProductsBean;
import tw.edu.shopping.gloria.shopping.domain.ProductsCommentsBean;
import tw.edu.shopping.gloria.shopping.domain.ProductsphotoBean;
import tw.edu.shopping.gloria.shopping.domain.TradesBean;
import tw.edu.shopping.gloria.shopping.domain.UserBean;
import tw.edu.shopping.gloria.shopping.service.BillService;
import tw.edu.shopping.gloria.shopping.service.FavoritesService;
import tw.edu.shopping.gloria.shopping.service.OdersService;
import tw.edu.shopping.gloria.shopping.service.ProductsCommmentsService;
import tw.edu.shopping.gloria.shopping.service.ProductsService;
import tw.edu.shopping.gloria.shopping.service.ProductsphotoService;
import tw.edu.shopping.gloria.shopping.service.TradesService;
import tw.edu.shopping.gloria.shopping.service.UserService;



@SpringBootTest
class ShoppingApplicationTests {

	@Autowired
	private  UserService  userService;
	
	@Autowired
	private  TradesService tradeService;
	
	@Autowired
	private  BillService billService;
	
	@Autowired
	private  FavoritesService favoritesService;
	
	@Autowired
	private  OdersService odersService;
	
	@Autowired
	private  ProductsCommmentsService  productsCommentsService;
	
	@Autowired
	private  ProductsService  productsService;
	
	@Autowired
	private  ProductsphotoService  productsphotoService;
	
	

	//@Test
	public void userBean() {
	//System.out.println("Hi");
	List<UserBean> beans= userService.selectAll();
	System.out.println(beans);
	}
	
	//@Test
	public void tradesBean() {
	List<TradesBean> tradebeans=tradeService.selectAll();
	System.out.println(tradebeans);
	
	}
	
	
	//@Test
	public void billBean() {
	List<BillBean> billbeans=billService.selectAll();
	System.out.println(billbeans);
	}
	
	//@Test
	public void favoritesBean() {
	List<FavoritesBean> favoritesbeans=favoritesService.selectAll();
	System.out.println(favoritesbeans);
	}
	
	//@Test
	public void odersBean() {
	List<OdersBean> odersbeans=odersService.selectAll();
	System.out.println(odersbeans);
	}
	
	//@Test
	public void productsCommentsBean() {
	List<ProductsCommentsBean> productsCommentsbeans= productsCommentsService.selectAll();
	System.out.println(productsCommentsbeans);
	
	}
	
	//@Test
	public void productsBean() {
	List<ProductsBean> productsbeans= productsService.selectAll();
	System.out.println(productsbeans);
	}
	
	@Test
	public void productsphotoBean() {
	List<ProductsphotoBean> productsphotobeans= productsphotoService.selectAll();
	System.out.println(productsphotobeans);
	}
	
	
	
}
