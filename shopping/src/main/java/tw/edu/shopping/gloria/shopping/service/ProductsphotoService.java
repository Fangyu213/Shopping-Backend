package tw.edu.shopping.gloria.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.edu.shopping.gloria.shopping.dao.BillRepository;
import tw.edu.shopping.gloria.shopping.dao.ProductsphotoRepository;
import tw.edu.shopping.gloria.shopping.domain.BillBean;
import tw.edu.shopping.gloria.shopping.domain.ProductsphotoBean;

@Service
public class ProductsphotoService {
	
	
	@Autowired
	private  ProductsphotoRepository productsphoto;
	
	public List<ProductsphotoBean> selectAll() {
		return  productsphoto.findAll(); 
	}

}
