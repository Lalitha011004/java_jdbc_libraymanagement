package com.bookshop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Inventory
{
	Connection con;
	DBUtil db=new DBUtil();
	String qry=null;
	Statement stmt;
	ResultSet rs;
	List <Book> l=new ArrayList<>();
  /*	public void add(Book b)
	{
		l.add(b);
	}     */
	 public boolean add(Book b)
	{
		
		 boolean sts=false;
		 int count=0;
		 try
		 {
			 con=db.getDBConnection();
			 stmt=con.createStatement();
			 count =stmt.executeUpdate("insert into bookdetails(name,author,price) values('"+b.getName()+"','"+b.getAuthor()+"',"+b.getPrice()+")");
			 if(count==1)
				 sts=true;
			 else
				 throw new Exception();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return sts;
	}
	/* public void update()
	{
		 System.out.println("Updated Sucessfully");
	}*/
	 public boolean update(Book b,int c)
	 {
		 boolean sts=false;
		 int count=0;
		 try
		 {
			 con=db.getDBConnection();
			 stmt=con.createStatement();
			 switch(c)
			 {
		         case 1:
		        	 qry="update bookdetails set name='"+b.getName()+"'where id="+b.getId();
		        	 break;
		         case 2:
		        	 qry="updated bookdetails set author='"+b.getAuthor()+"'where id="+b.getId();
		        	 break;
		         case 3:
		        	 qry="update bookdetails set price="+b.getPrice()+"where id="+b.getId(); 
		        	 break;
			 }
			 count =stmt.executeUpdate(qry);
			 if(count==1)
				 sts=true;
			 else
				 throw new Exception();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return sts;
	 }
	/*public void remove(int id)  
	{
		for(int i=0;i<l.size();i++)
		{
			if (id==(l.get(i).getId()))
				l.remove(i);
		}
	}*/
	 public boolean remove(Book b)
	 {
		 boolean sts=false;
		 int count=0;
		 try
		 {
			 con=db.getDBConnection();
			 stmt=con.createStatement();
			 qry="delete from bookdetails where id="+b.getId();
			 count=stmt.executeUpdate(qry);
			 if(count==1)
				 sts=true;
			 else
				 throw new Exception();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return sts;
	 }
	public Book search(int id)
	{
		for(int i=0;i<l.size();i++)
		{
			if(id==(l.get(i).getId()))
				return (l.get(i));
		}
		return null;
	}
	public void show()
	{
		/*for(Book b:l)
		{
			System.out.println(b);
		}*/
		try
		{
			con=db.getDBConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from bookdetails");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
		}
		catch (Exception e)
		{
			System.out.println(e);
			
		}
	}
}