package sep16;
import java.util.Scanner;
	public class Vegetable
	{
		public void veg(){
	int cost,cost1,cost2,cost3;
	Scanner s=new Scanner(System.in);

	System.out.println("====welcome to Market");
	System.out.println("select one vegetable which you want");
	System.out.println("1.allu\n2.tamato\n3.carrot\n4.beens");
	int a =s.nextInt();
	if (a==1)
	{
		System.out.println("u r selected allu----1kg--50");
		System.out.println("enter the quanty");
		int b=s.nextInt();
		System.out.println("allu price.....:"+(cost=b*50));
		System.out.println("bill generated successfully");
		m1();
	}
	else if (a==2)
	{
		System.out.println("u r selected tamato----1kg--20");
		System.out.println("enter the quanty");
		int c=s.nextInt();
		System.out.println("tamato price.....:"+(cost1=c*20));
		System.out.println("bill generated successfully");
		m1();

	 }
	else if (a==3)
	{
		System.out.println("u r selected carrot----1kg--35");
		System.out.println("enter the quanty");
		int d=s.nextInt();
		System.out.println("carrot price.....:"+(cost2=d*35));
		System.out.println("bill generated successfully");
		m1();
	}
	else if (a==4)
	{
		System.out.println("u r selected beens----1kg--45");
		System.out.println("enter the quanty");
		int e=s.nextInt();
		System.out.println("been price.....:"+(cost=e*45));
		System.out.println("bill generated successfully");
		m1();

	 }
	else
	{
		System.out.println("invalide selection");
		System.out.println("bill does not generated");
	}    }
		public void m1()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("press 1 if u continue or press 2 if u want to exit");
			int k=s.nextInt();
			if(k==1)
			{
				veg();                      
				}   
			else
			{
				System.out.println("exit");     }

	}
	public static void main(String[] args)
	{
		Vegetable v=new Vegetable();
	v.veg();     
	}
	}



