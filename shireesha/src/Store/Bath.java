package Store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Bath 
{
	public static int price,sum;
public void method2()
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "root");
	    Statement statement=con.createStatement();
	    ResultSet set=statement.executeQuery("SELECT * FROM product.bath");
	    System.out.println("welcome to Bath store");
	    System.out.println("*******************************");
	    System.out.println("ID  NAME  PRICE QUENTITY");
	    System.out.println("********************************");
	    while(set.next())
	    {
	    	System.out.println(set.getInt(1)+"\t"+set.getString(2)+"\t"+set.getString(3)+"\t"+set.getString(4));
	    }
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

public void method22() {
	try {
		Scanner sc=new Scanner(System.in);
	  
	  System.out.println("enter id");
	  int a1=sc.nextInt();
	  System.out.println("enter quentity");
	  int  a2=sc.nextInt();
	  Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "root");
	    Statement statement=con.createStatement();
	    ResultSet set=statement.executeQuery("SELECT * FROM product.bath where ` Id`='"+a1+"'");
	    while(set.next()) {
	    	int e=set.getInt(3);
		price=e*a2;
		sum+=price;
	    System.out.println("total bill"+sum);
	    	
	    } 
	    
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
