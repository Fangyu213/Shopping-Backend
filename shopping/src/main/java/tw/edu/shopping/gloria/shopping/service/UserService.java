package tw.edu.shopping.gloria.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.edu.shopping.gloria.shopping.dao.UserRepository;
import tw.edu.shopping.gloria.shopping.domain.UserBean;



    @Service
	public class UserService {

		@Autowired
		private  UserRepository User;
		
		public List<UserBean> selectAll() {
			return  User.findAll(); 
		}


	}


