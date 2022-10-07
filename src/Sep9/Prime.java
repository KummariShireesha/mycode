package Sep9;
import java.util.Scanner;
public class Prime
{

public static void main(String []args)
{
	int num,i,j,count;
	System.out.println("enter your number");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	System.out.println("enter prime numbers between 20 to"+ 40+"are");
	for(j=2;j<40;j++)
	{
		count=0;
		for(i=20;i<=j;i++)
		{
			if(j%i==0) 
			{
				count++;
			
		}
	}
		if(count==2)
		{
			System.out.println(j+" ");
		}
	}
}
}
