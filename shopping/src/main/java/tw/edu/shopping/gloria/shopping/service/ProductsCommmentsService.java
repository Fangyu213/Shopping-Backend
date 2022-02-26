package tw.edu.shopping.gloria.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.edu.shopping.gloria.shopping.dao.BillRepository;
import tw.edu.shopping.gloria.shopping.dao.ProductsCommmentsRepository;
import tw.edu.shopping.gloria.shopping.domain.BillBean;
import tw.edu.shopping.gloria.shopping.domain.ProductsCommentsBean;

@Service
public class ProductsCommmentsService {
	
	@Autowired
	private  ProductsCommmentsRepository productsCommments;
	
	public List<ProductsCommentsBean> selectAll() {
		return  productsCommments.findAll(); 
	}

}
