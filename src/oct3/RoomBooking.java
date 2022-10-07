package oct3;
import java.util.*;
public class RoomBooking 
{

Scanner sc=new Scanner(System.in);

String =sc.nextLine();
System.out.println("Enter 1.pune\n 2.goa\n ");
String i=sc.nextLine();

	System.out.println(" Room Booking System");
	System.out.println("Enter the location you want to book");
	String[] city = new String[2];
	city[0]="pune";
	city[1]="Goa";
	System.out.println("Enter the name of the city correctly given below\n1.pune\n2.Goa");
	String city1 = sc.next();
	
	if(city1.equals(city[0])){
		System.out.println("=====Welcome to pune======");
		System.out.println("Please select the Hotel..");
		System.out.println("\n1.5 star\n2.Taj hotel");
		int ht = sc.nextInt();

	Object city2;
	Object city3;
	Object city4;
	
	Object city5;
	Object city6;
	Object city7;
	if(city2.equals(city[0]))
	{
	System.out.println("please selet the hotel");
	System.out.println("\n 1.mountie\n 2.taj hotel ");
	int ht1=sc.nextInt();
	
	}
	else if(city1.equals(city2))
	{
		System.out.println("please enter number of childs");
		System.out.println("plese enter number of adults");
		int ht1=sc.nextInt();
		
	}
	else if(city2.equals(city[0]))
	{
		System.out.println("please enter below 12 years chlds");
		System.out.println("please enter mountie");
		int ht2=sc.nextInt();
	}
	else if(city3.equals(city[0]))
	{
		System.out.println("======welcome to goa=====");
		System.out.println("1.mountie2 \n 2.start htel");
		System.out.println("enter one or two");
		int ht3=sc.nextInt();
		}
	else if(city4.equals(city[0]))
	{
		System.out.println("enter the number of adults");
		System.out.println("please number adults");
		int ht4=sc.nextInt();
	}
	else if (city5.equals(city[0]))
	{
	System.out.println("enter ac room");
	System.out.println("enter bellow 12 age childs");
	System.out.println("enter nonac");
	int ht5=sc.nextInt();
	}
	else if(city6.equals(city[0]))
	{
		System.out.println("enter the nonac room");
		System.out.println("enter cost of nonac room");
		System.out.println("enter ac room");
		System.out.println("cost of ac room");
		int ht6=sc.nextInt();
	}
	else if(city7.equals(city[0]))
	{
		System.out.println("enter the non ac rooms");
		System.out.println("enter cost of room");
		int ht7=sc.nextInt();
	}
	else if(city.equals(city[0]))
	{
		System.out.println("===thank you====");
		System.out.println("visit again");
	}
	else 
	{
		System.out.println("Invalid selections");
		//System.out.println("thank you");
	}
	
	public static void main(String []args)
	{
		RoomBooking aobj=new RoomBooking();
		//aobj.m1();
	}
}
