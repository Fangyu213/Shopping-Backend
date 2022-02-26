package tw.edu.shopping.gloria.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.edu.shopping.gloria.shopping.dao.BillRepository;

import tw.edu.shopping.gloria.shopping.domain.BillBean;

@Service
public class BillService {

	
	

	@Autowired
	private  BillRepository bill;
	
	public List<BillBean> selectAll() {
		return  bill.findAll(); 
	}


}
