package tw.edu.shopping.gloria.shopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.edu.shopping.gloria.shopping.domain.BillBean;
import tw.edu.shopping.gloria.shopping.domain.OdersBean;

public interface OdersRepository extends JpaRepository<OdersBean, Integer>{

}


