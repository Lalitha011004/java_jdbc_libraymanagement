package com.bookshop;

public class Login
{
	public boolean checkUser(User u) 
	{
		if(u.getU_name().equals("Lali"))
		{
			System.out.println(u.getU_name());
			return true;
		}
		else
		{
			System.out.println(u.getU_name());
			return false;
		}
	}
}