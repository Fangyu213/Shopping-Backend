package tw.edu.shopping.gloria.shopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.edu.shopping.gloria.shopping.domain.BillBean;
import tw.edu.shopping.gloria.shopping.domain.FavoritesBean;

public interface FavoritesRepository extends JpaRepository<FavoritesBean, Integer>{

}