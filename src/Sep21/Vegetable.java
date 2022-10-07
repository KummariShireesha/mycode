package Sep21;
import java.util.Scanner;
public class Vegetable
{
	public static int tot;
	public static int bill;;
public void veg()
{
	int  bill1,bill2,bill3;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("select one vegetable");
	System.out.println("1.beens\n2.tamato\n3.onion");
	int a=sc.nextInt();
	if(a==1) {
		System.out.println("select beens----1kg----50");
		System.out.println("enter quantity");
		
		int b=sc.nextInt();
		System.out.println("beens price is:"+(bill=b*50));
		tot=tot+bill;
		m1();
	}
	else if (a==2)
	{
		System.out.println("select tamato------2kg---60");
		System.out.println("enter the quantity");
		int c=sc.nextInt();
		System.out.println("tamato priceis:"+(bill=c*60));
		tot=tot+bill;
		
		m1();
		
	}
	else if(a==3) {
		System.out.println("select onion----2kg---40");
		System.out.println("enter the quantity");
		int d=sc.nextInt();
		System.out.println("onion priceis:"+(bill=d*40));
		tot=tot+bill;
		m1();
	}
	else
	{
		System.out.println("Invalid selection");
		veg();
		
	}
}
   public void m1()
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter 1 for continue shopping or exit");
	 int e = sc.nextInt();
	 if(e==1)
	 {
		 veg(); 
	 }
	 else
	 {
		 System.out.println("thnk u ");
		 System.out.println("Total bill is :"+tot);
	 }
   }
   public static void main(String []args)
   {
	   Vegetable aobj=new Vegetable();
	   System.out.println("welcome to market");
	   aobj.veg();
   }
}
