package tw.edu.shopping.gloria.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.edu.shopping.gloria.shopping.domain.ProductsBean;

import tw.edu.shopping.gloria.shopping.dao.ProductsRepository;

@Service
public class ProductsService {

	@Autowired
	private  ProductsRepository products;
	
	public List<ProductsBean> selectAll() {
		return  products.findAll(); 
	}

}
