package Sep22;
import java.util.*;
public class Array
{
	static Scanner sc = new Scanner(System.in);
	static int a[][] = new int[3][3];
	public static int a1;
	public static int a2;
	public static void displayArr()
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.print(""+a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void again()
	{
		System.out.println("\nPress\n1.For Continue\n2.For Exit");
		int choice = sc.nextInt();
		if(choice==1)
		{
			select();
		}
		else
		{
			System.out.println("====Thank you====");
		}
	}
	public static void select()
	{
		System.out.println("\n1.For Adding Elements\n2.For Difference between two Diagnols \n3.Print Specific Row\n4.Print Specific Column\n5.For Exit");
		int choice = sc.nextInt();
		if(choice==1)
		{
			arr();
		}
		else if(choice==2)
		{
			diagnoalDifference();
		}
		else if(choice==3)
		{
			row();
		}
		else if(choice==4)
		{
			column();
		}
		else if(choice==5)
		{
			System.out.println(" ====Thank you==== ");
		}
		else
		{
			System.out.println("Invalid Selection");
			System.out.println("Please select again");
			select();
		}
	}
	public static void arr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of an 3*3 array ");
		for(int i=0;i<3;i++)
		{
			for (int j = 0; j < 3; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix form is :");
		System.out.println("======================");
		displayArr();
		again();
	}
	public static void diagnoalDifference()
	{
		for(int i=0;i<3;i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if(a[i]==a[j])
				{
					a1=a1+a[i][j];
				}
				if(i+j==2)
				{
					a2=a2+a[i][j];
				}
			}
		}
		displayArr();
		System.out.println("Sum of elements from left to right: "+a1);
		System.out.println("Sum of elements from right to left: "+a2);
		System.out.println("The difference between diagonals is : "+(a1-a2));
		again();
	}
	public static void column()
	{
		displayArr();
		System.out.println("Enter the column which is below "+a.length+" to print ");
		int r = sc.nextInt();
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i][r]+" ");
		}
		
		System.out.println();
		again();
	}
	public static void row()
	{
		displayArr();
		System.out.println("Enter the row which is below "+a.length+" to print ");
		System.out.println();
		int r = sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.print(a[r][i]+" ");
				break;
			}
		}
		again();
	}
	public static void main(String[] args)
	{
		System.out.println("Select Given Below\nIt is Mandatory to add the elements first");
		select();
	}
}
