package Sep9;
import java.util.Scanner;
public class ArrayTest
{
	public void Array()
	{
	int a[]=new int[6];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your values");
	for(int i=0;i<6;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("output");
	for(int i=0;i<5;i++)
	{
		System.out.println(a[i]);
	}
	}
public static void main(String []args)
{
	ArrayTest aobj=new ArrayTest();
	aobj.Array();
}
}
