package com.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.User;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{
//	
//	private String username;
//	private String password;

	private User user;
	
	public LoginBean() {}
	
	@PostConstruct
	public void init() {
		user = new User();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	public String goToWelcom() {
		return "/pages/welcome?faces-redirect=true";
	}
	
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
	

}
