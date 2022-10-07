package sep16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class InsertValuesDB 
{
	public static void main(String []args)
	{
		System.out.println("Enter your values");
		String name;
		int java,ds,db,id;
		Scanner sc=new Scanner(System.in);
//		id=sc.nextInt();
		name=sc.next();
		java=sc.nextInt();
		db=sc.nextInt();
		ds=sc.nextInt();
	try {
	
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    System.out.println("Driver Found");
	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	    Statement statement=connection.createStatement();
	   //String query="insert into student values(10,'chitti',80,90,70)";
	    //String query="delete from student where id=0";
	    String q="insert into `student`.`student`(`name`,`java`,`db`,`ds`)values('"+name+"','"+java+"','"+db+"','"+ds+"')";
	   statement.executeUpdate(q);
	   System.out.println("inserted");
}
	catch (Exception e) {
	    System.out.println(e);
	}
}
}



