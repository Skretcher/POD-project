package com.cts.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.usermanagement.dao.UserDao;
import com.cts.usermanagement.model.AppUser;

@Service
//The @Service annotation is also used at the class level
//to mark a service implementation like busness logic or api calling
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public AppUser registerUser(AppUser appUser) {
		return userDao.save(appUser);
	}
	
	public List<AppUser> getUsers(){
		return (List<AppUser>) userDao.findAll();		 
	}
	
	public void deleteUser(Integer id) {
		userDao.deleteById(id);
	}
	
	public AppUser updateUser(AppUser appUser) {
		
		
		Integer id = appUser.getId();
		AppUser us = userDao.findById(id).orElse(appUser);
		us.setMailId(appUser.getMailId());
		us.setMobile(appUser.getMobile());
		us.setName(appUser.getName());
		us.setPassword(appUser.getPassword());
		us.setRegDate(appUser.getRegDate());
		
		return userDao.save(us);
	}
	
	public AppUser getUserById(Integer id) {
		return userDao.findById(id).orElse(null);
	}
	
	
}
