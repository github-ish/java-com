package com.java.service;

import com.java.model.*;
import com.java.dao.*;
public class LoginClass {
	Userdao dao  = new Userdao();
	
	public User authenticate(String name, String pass)
	{
		User user;
		user=dao.getUserById(name,pass);
		System.out.println(user.getType());
		if (user.getType().equals("r"))
		{
			System.out.println("reader");
			//Reader reader =(Reader)user;
		}
		//System.out.println("service"+name+pass);
		return user;
		
	}

}
