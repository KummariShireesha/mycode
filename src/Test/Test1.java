package Test;

import java.util.Scanner;

public class Test1
{
	public static void main(String []args)
	{
		String a,b;
		Scanner scanner=new Scanner(System.in);
		a=scanner.next();
		b=scanner.next();
		int c,d;
		c=Integer.parseInt(a);
		d=Integer.parseInt(b);
		System.out.println("String"+a+b);
		System.out.println("Interger"+(c+d));
	}

}
