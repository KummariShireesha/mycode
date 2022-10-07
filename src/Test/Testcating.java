package Test;
import java.util.Scanner;
public class Testcating
{
public static int add()
{
	int a,b,c;
	Scanner scanner=new Scanner(System.in);
	a=scanner.nextInt();
	b=scanner.nextInt();
	c=a+b;
	return (int)c;
}
public static void main(String []args)
{
	Testcating.add();
}
}
