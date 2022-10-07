package sep16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class pro2
{
public static void main(String []args)
{
	int total[] = new int[6];
    String name[] = new String[6];
    int i =0;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
//        System.out.println("Driver Found");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
//        System.out.println("connection success : "+connection);
        Statement statement =  connection.createStatement();
         ResultSet rs =   statement.executeQuery("select * from student ");
         while(rs.next())
         {
             name[i]=rs.getString(2);
             total[i]=rs.getInt(3)+rs.getInt(4)+rs.getInt(5);
             System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
             i++;
         }
         for( i=0;i<5;i++)
         {
             System.out.println(name[i]+" Scored "+total[i]);
         }
         int top=0,pos=0;
         for ( i = 0; i < 5; i++)
         {
            if (total[i]>total[i+1])
            {
                top=total[i];
                break;
            }
        }
         System.out.println("===========================");
        System.out.println(name[i]+" secored best "+total[i]);
        connection.close();
    }
    catch (Exception e) {
        System.out.println(e);



   }
}
}
