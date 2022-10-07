package Test;
import java.util.Scanner;
public class FirstTest
{
public static void main(String []args)
{
int a,b,sum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a numbers:");
a=sc.nextInt();
System.out.println("Enter a number:");
b=sc.nextInt();
sum=sum(a,b);
System.out.println("sum of a and b:"+sum);
}

private static int sum(int a, int b)
{
	int sum=a+b;
	
	return sum;
}
}
