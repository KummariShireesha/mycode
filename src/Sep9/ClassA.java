package Sep9;
import java.util.Scanner;
public class ClassA 
{
public static void Family()
{
	
	System.out.println("please enter the members in a family");
	Scanner sc=new Scanner(System.in);
	int f=sc.nextInt();
	if(f==4)
	{
		System.out.println("please enter the no.of Adults");
		int a=sc.nextInt();
		System.out.println("please enter the no.of childs");
		int b=sc.nextInt();
		
		
		if(a<3)
		{
			System.out.println("no extra charges applied");
			
				roomtype();
			}
			else {
				System.out.println("charges applied");
			}
		}
			else {
				System.out.println("you need to another room");
			}
		}
	public void method()
	
	{
		Scanner s=new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("please select hotels");
		System.out.println("1.hotel1 \n2.hotel2");
		System.out.println("enter a number");
		int a=s.nextInt();
		if(a==1)
		{
			System.out.println("you are select hotel 1");
			Family();
		}
		else if(a==2)
		{
			System.out.println("you are select hotel 2");
			Family();
		}
		else if(a==3)
		{
			System.out.println("you are select hotel 3");
			Family();
		}
		else if(a==4) {
			System.out.println("you are select hotel 4");
		}
		else 
		{
			System.out.println("invalid selected");
		}
		
	}

private static void roomtype() {
	System.out.println("---AC/NoN AC-----");
	System.out.println(" 1.Ac\n2.Non Ac");
    Scanner s1=new Scanner(System.in);
    System.out.println("choose 1 type of room");
    int a=s1.nextInt();
    if(a==1) {
    	System.out.println("room amount is 3000rs");
    }
    else {
    	System.out.println("amount is 2000");
    }
	
}
public static void main(String []args)
{
	ClassA aobj=new ClassA();
	aobj.Family();  
}
}
