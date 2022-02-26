package tw.edu.shopping.gloria.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.edu.shopping.gloria.shopping.dao.BillRepository;
import tw.edu.shopping.gloria.shopping.dao.FavoritesRepository;
import tw.edu.shopping.gloria.shopping.domain.BillBean;
import tw.edu.shopping.gloria.shopping.domain.FavoritesBean;

@Service
public class FavoritesService {
	
	@Autowired
	private  FavoritesRepository favorites;
	
	public List<FavoritesBean> selectAll() {
		return  favorites.findAll(); 
	}


}
