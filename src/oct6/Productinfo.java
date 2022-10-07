package oct6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;




public class Productinfo implements ProductDao
{
private static Product product;

public static void main(String []args)
{
	ArrayList<Product> arrayList=new ArrayList();

	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "root");
	    Statement statement=con.createStatement();
	    ResultSet set=statement.executeQuery("select *from pro");
	    
	    while(set.next()) 
	    {
	 Product aobj=new Product();
	 aobj .setId(set.getString(2));
	 aobj.setName(set.getString(2));
	 aobj.setPrice(set.getString(2));
	 aobj.setQuentity(set.getString(2));
	    	
	    	
			arrayList.add(product);
	    }
	    for(Product e:arrayList)
	    {
	    	System.out.println(e.getId()+" \t"+e.getproductid()+" \t "+e.getName()+"  "+e.getPrice()+"\t"+e.getQuentity());
	    	
	    }
	 
	}
}

public void addproduct(Object product2) {
	// TODO Auto-generated method stub
	
}
}
