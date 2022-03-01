package tw.edu.shopping.gloria.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.edu.shopping.gloria.shopping.dao.BillRepository;
import tw.edu.shopping.gloria.shopping.dao.OdersRepository;
import tw.edu.shopping.gloria.shopping.domain.BillBean;
import tw.edu.shopping.gloria.shopping.domain.OrdersBean;

@Service
public class OdersService {

	
	@Autowired
	private  OdersRepository oders;
	
	public List<OrdersBean> selectAll() {
		return  oders.findAll(); 
	}

}
