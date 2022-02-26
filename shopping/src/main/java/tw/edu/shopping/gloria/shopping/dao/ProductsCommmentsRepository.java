package tw.edu.shopping.gloria.shopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.edu.shopping.gloria.shopping.domain.BillBean;
import tw.edu.shopping.gloria.shopping.domain.ProductsCommentsBean;

public interface ProductsCommmentsRepository extends JpaRepository<ProductsCommentsBean, Integer>{

}

