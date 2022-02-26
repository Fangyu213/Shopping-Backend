package tw.edu.shopping.gloria.shopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.edu.shopping.gloria.shopping.domain.TradesBean;
import tw.edu.shopping.gloria.shopping.domain.UserBean;

public interface TradesRepository extends JpaRepository<TradesBean, Integer>{

}
