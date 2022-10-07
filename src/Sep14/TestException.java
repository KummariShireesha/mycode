package Sep14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestException
{
public static void main(String []args)
{
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver Found");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
    Statement statement=connection.createStatement();
    ResultSet rs=statement.executeQuery("select *from student");
    while(rs.next()) {
    	System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
    	//name[1]=set.getString(2);
    	//total[i]=set.getInt(3)+set.getInt(4)+set.getInt(5);
    	//i++;
    //}
   // for(i=0;i<5;i++)
    //{
    	//System.out.println(name[i]+" scored"+total[i]);
   // }
    //int top=0,pos=0;
    //for(i=0;i<4;i++)
   // {
    	//top=total[i];
    	//break;
    }
    //System.out.println("connection success : "+connection);
}
//System.out.println(name[i]+"scored best");
catch (Exception e) {
    System.out.println(e);



} 
	 }
	 
	 
}