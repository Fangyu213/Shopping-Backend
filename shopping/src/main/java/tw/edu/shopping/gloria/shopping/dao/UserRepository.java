package tw.edu.shopping.gloria.shopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.edu.shopping.gloria.shopping.domain.UserBean;


public interface UserRepository extends JpaRepository<UserBean, Integer>{

}