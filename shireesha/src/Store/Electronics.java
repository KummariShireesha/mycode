package Store;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Electronics
{
	public static int price,sum;
public void method()
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "root");
	    Statement statement=con.createStatement();
	    ResultSet set=statement.executeQuery("SELECT * FROM product.pro");
	    System.out.println("welcome to Electronics store");
	    System.out.println("*********************************");
	    System.out.println("ID    NAME   PRICE   QUENTITY");
	    System.out.println("*********************************");
	    while(set.next())
	    {
	    	System.out.println(set.getInt(1)+ "\t"+set.getString(2)+"\t"+set.getInt(3)+"\t"+set.getInt(4));
	    }
	}
	catch(Exception e)
	{
		System.out.println(e);
		
	}
}
public void method11()
{
	try {
		Scanner sc=new Scanner(System.in);
	  
	  System.out.println("enter id");
	  int a1=sc.nextInt();
	  System.out.println("enter quentity");
	  int  a2=sc.nextInt();
	  Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "root");
	    Statement statement=con.createStatement();
	    ResultSet set=statement.executeQuery("SELECT * FROM product.pro where `product Id`='"+a1+"'");
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
