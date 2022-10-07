package Test;
import java.util.Scanner;
public class Division 
{
public static void main(String []args)
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	int a=scanner.nextInt();
	System.out.println("enter the number");
	int b=scanner.nextInt();
	for(int i=a;i<b;i++)
	{
		if(i%3==0)
		
		{
			System.out.println(i);
		}
		else if(i%4==0)
		{
			System.out.println(i);
		}
		else {
			System.out.println("not dividsible"+i);
		}
	}
	
}
}
