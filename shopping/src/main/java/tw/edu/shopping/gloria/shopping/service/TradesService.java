package tw.edu.shopping.gloria.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.edu.shopping.gloria.shopping.dao.TradesRepository;
import tw.edu.shopping.gloria.shopping.dao.UserRepository;
import tw.edu.shopping.gloria.shopping.domain.TradesBean;
import tw.edu.shopping.gloria.shopping.domain.UserBean;

@Service
public class TradesService {
	
	   
		

			@Autowired
			private  TradesRepository trades;
			
			public List<TradesBean> selectAll() {
				return  trades.findAll(); 
			}


		

}
