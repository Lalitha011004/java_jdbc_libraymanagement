package com.bookshop;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Book b;
		Inventory i=new Inventory();
		Book b1=new Book();
		int op,con,id;
		String name,author,u_name,pwd;
		User u;
		Login l=new Login();
		float price;
		do 
		{
			System.out.println("Enter Login Details ");
			System.out.println("Enter User Name: ");
			u_name=scan.next();
			System.out.println("Enter Password: ");
			pwd=scan.next();
			u=new User(u_name,pwd);
			boolean lc=l.checkUser(u);
			if(lc)
			{
				do
				{
					System.out.println("1-Add\n2.Update\n3.Remove\n4.Search\n5.Display");
					System.out.println("Enter Option: ");
					int option=scan.nextInt();
					switch(option)
					{
					case 1:
						/*System.out.println("Enter ID: ");
						id=scan.nextInt();
						System.out.println("Enter Name: ");
						name=scan.next()+scan.nextLine();
						System.out.println("Enter Author: ");
						author=scan.next()+scan.nextLine();
						System.out.println("Enter Price: ");
						price=scan.nextFloat();
						i.add(new Book(id,name,author,price));  */
						System.out.println("Enter Name: ");
						name=scan.next()+scan.nextLine();
						System.out.println("Enter Author: ");
						author=scan.next()+scan.nextLine();
						System.out.println("Enter Price: ");
						price=scan.nextFloat();
						boolean addsts=i.add(new Book(name,author,price));
						if (addsts)
							System.out.println("Details Added to DB");
						else
							System.out.println("Details could not be added to DB");
						break;
					case 2:
						/*System.out.println("Enter ID: ");
						id=scan.nextInt();
						b=i.search(id);
						System.out.println("1-Change Name\n2-Change Author\n3-Change Price");
						System.out.println("Enter Check: ");
						int c=scan.nextInt();
						switch(c)
						{
						case 1:
							System.out.println("Enter Name: ");
							name=scan.next()+scan.nextLine();
							b.setName(name);
							break;
						case 2:
							System.out.println("Enter Author: ");
							author=scan.next()+scan.nextLine();
							b.setAuthor(author);
							break;
						case 3:
							System.out.println("Enter Price: ");
							price=scan.nextFloat();
							b.setPrice(price);
							break;
						}*/
						System.out.println("Enter ID:");
						id=scan.nextInt();
						b1.setId(id);
						System.out.println("1-Change Name\n2-Change Author\n3-Change Price");
						System.out.println("Enter Check: ");
						int c=scan.nextInt();
						switch(c)
						{
						case 1:
							System.out.println("Enter Name: ");
							name=scan.next()+scan.nextLine();
							b1.setName(name);
							break;
						case 2:
							System.out.println("Enter Author: ");
							author=scan.next()+scan.nextLine();
							b1.setAuthor(author);
							break;
						case 3:
							System.out.println("Enter Price: ");
							price=scan.nextFloat();
							b1.setPrice(price);
							break;
						}
						boolean updsts=i.update(b1,c);
						if(updsts)
							System.out.println("Details Updated");
						else
							System.out.println("Details could not be updated");
						break;
					case 3:
						/*System.out.println("Enter ID: ");
						id=scan.nextInt();
						i.remove(id);
						break;*/
						System.out.println("Enter ID: ");
						id=scan.nextInt();
						b1.setId(id);
						boolean dltsts=i.remove(b1);
						if(dltsts)
							System.out.println("Deleted Sucessfully");
						else
							System.out.println("Could not delets");
						break;
					case 4:
						System.out.println("Enter ID: ");
						id=scan.nextInt();
						b1=i.search(id);
						System.out.println(b1);
						break;
					case 5:
						i.show();
						break;
					}
					System.out.println("Enter Op: ");
					op=scan.nextInt();
				}while(op!=-1);
			}
			else
			{
				i.show();
			}
			System.out.println("Enter 1 to Logout and continue using another Login or Enter -1 to Exit");
			con=scan.nextInt();
		}while(con!=-1);
	}

}
