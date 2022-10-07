package Sep9;
import java.util.Scanner;
public class Task
{

private static final int Adults = 0;
private static final int Child = 0;
public void UserDetails()
{
	Scanner sc=new Scanner(System.in);
	String name;
	int hotel;
	String Cd;
	String Ad;
	System.out.println("enter your name");
	String uname = sc.nextLine();
	System.out.println("enter no.of adults");
	Ad=sc.nextLine();
	System.out.println("enter no.of childs");
	Cd=sc.nextLine();
    System.out.println("please choose to Hotel 1 ");
    System.out.println("Taj hotel");
    hotel=sc.nextInt();
    System.out.println("Type of room");
    String room =sc.nextLine();
    if(hotel==1)
    {
    	//if(Ac ==3000 && nc== 2500) {
    		//System.out.println("hotel 1");      
    	//}
    }
	if(Adults<=10)
    {
    	System.out.println("charge");
    }
	else if(Child>=10)
	{
		System.out.println("No charges");
	}
	else {
		System.out.println("no charge");
	}
	
	
}
public static void main(String[] args) {
	Task aobj=new Task();
	aobj.UserDetails();
}
}
