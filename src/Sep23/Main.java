package Sep23;
import java.util.Scanner;
public class Main 
{
		public static void main(String[] args) //main method execution starts from this class
		{
			System.out.print("Enter the size of an array : ");
			Demo Demo= new Demo();//object creation of Demo class 
			System.out.println("\nIt is Mandatory to add the elements first");
			Sep23.Demo.select();		
		}
	}
	class Demo
	{
		static Scanner sc = new Scanner(System.in);
		static int n = sc.nextInt();//size of an array for both rows and columns 
		static int a[][] = new int[n][n];//2D-array creation with the specific size that is given by user
//		static int nullArray[][] = new int[0][0];;
		public static int a1;
		public static int a2;
		public static void options()//This method is for to do operations for 
		{
			System.out.println();
			System.out.println("===============================================");
			System.out.println("Select Your Operation\n1.For Difference between two Diagonal's \n2.Provide Row number to print\n3.Provide Column number to print\n4.Reset Array\n5.For Exit");
			int choice1 = sc.nextInt();
			if(choice1==1)
			{
				diagnoalDifference();//Difference between two diagonals 
			}
			else if(choice1==2)
			{
				row();//to print the specific Row with horizontal by user choice
			}
			else if(choice1==3)
			{
				column();//to print the specific column with vertically  by user choice
			}
			else if(choice1==4)
			{
				reset();//This method is used for reset an array
			}
			else if(choice1==5)
			{
				System.out.println(" ====Thank you==== ");
			}
			else
			{
				System.out.println("Invalid Selection");
				System.out.println("Please select again");
				select();//Method is for user to select what he needs after inserting elements into an array
			}
		}
		public static void select() //Method is for user to select what he needs after inserting elements into an array
		{
			System.out.println("\n1.Enter 1  for Adding Elements");
			int choice = sc.nextInt();
			if(choice==1)
			{
				arr();//Method shows to take the elements form the user to an array
			}
			else
			{
				System.out.println("Invalid Selection Select again");
				select();//Method is for user to select what he needs after inserting elements into an array
			}
		}
		public static void arr()//Method shows to take the elements form the user to an array
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the elements of an "+n+"*"+n+" array ");
			for(int i=0;i<n;i++)
			{
				for (int j = 0; j < n; j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("The matrix form is :");
			System.out.println("======================");
			displayArr();//The method is for displaying the 2D-array elements 
			again();//To continue the process till user exit's the program
		}
		public static void displayArr() //The method is for displaying the 2D-array elements 
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					System.out.print(""+a[i][j]+" ");
				}
				System.out.println();
			}
		}
		public static void diagnoalDifference()//Difference between two diagonals 
		{
			for(int i=0;i<n;i++)
			{
				for (int j = 0; j < n; j++)
				{
					if(a[i]==a[j])
					{
						a1=a1+a[i][j];
					}
					if(i+j==n-1)
					{
						a2=a2+a[i][j];
					}
				}
			}
			displayArr();//The method is for displaying the 2D-array elements 
			System.out.println("Sum of diagonals from left to right: "+a1);
			System.out.println("Sum of diagonals from right to left: "+a2);
			System.out.println("The difference between"+a1+" and "+a2+" is diagonals : "+(a1-a2));
			again();//To continue the process till user exit's the program
		}
		public static void column()//to print the specific column with vertically  by user choice
		{
			System.out.println("Enter the column which is below "+n+" to print ");
			int r = sc.nextInt();
			if(r>0&&r<=n)
			{
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i][r-1]+" ");//Displaying an array by user choice
			}
			System.out.println();
			again();//To continue the process till user exit's the program
			}
			else
			{
				System.out.println("We have only "+n+" columns So please enter below "+(n));
				column();//to print the specific column with vertically  by user choice
			}
		}
		public static void row()//to print the specific Row with horizontally  by user choice
		{    
			System.out.println("Enter the row which is below "+n+" to print ");
			System.out.println();
			int r = sc.nextInt();
			if(r>0&&r<=n)
			{
			for(int i=0;i<n;i++)
			{
				for (int j = 0; j < n; j++)
				{
					System.out.print(a[r-1][i]+" ");//Printing specific row
					break;
				}
			}
			again();//To continue the process till user exit's the program
			}
			else
			{
				System.out.println("We have only "+n+" rows So please enter below "+(n));
				row();//to print the specific Row with horizontally  by user choice
			}
		}
		public static void reset()//this method is used for array reset
		{
					try
					{
						for(int i = 0; i < a.length; ++i)
						{
						    for(int j = 0; j < a[i].length; ++j)
						    {
						        a[i][j] =0;
						    }
						}
						for(int i = 0; i < a.length; ++i)
						{
						    for(int j = 0; j < a[i].length; ++j)
						    {
						        System.out.print("    ");
						    }
						    System.out.println();
						}
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						
						System.out.println("====Thank you====");
					}
					System.out.println("The array elements are NULL");
					System.out.println("====Thank you====");
		}
		public static void again()//To continue the process till user exit's the program
		{
			System.out.println("\nPress\n1.For Continue\n2.For Exit");
			int choice = sc.nextInt();
			if(choice==1)
			{
				options();//This method is for to do operations for 
			}
			else
			{
				System.out.println("====Thank you====");
			}
		}
	}

