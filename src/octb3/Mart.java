package octb3;
import java.util.Scanner;
public class Mart 
{
	public static int bg=50000;
	public static int bill;
	public static int tot;
public void Grocery()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("shopping store have some sections");
	System.out.println("1.Electronics\n2.Bath\n3.kitchen\n4.Cloths\n5.Others");
	int a=sc.nextInt();
	
	if(a==1)
	{
		System.out.println("Electronics sections");
		System.out.println("1.mobile\n2.tv");
		int a1=sc.nextInt();
		if(a1==1)
		{
			System.out.println("mobile section======20000");
			  System.out.println(" enter quenty");
		    int cc=sc.nextInt();
		    System.out.println("mobile price is:"+(bill=cc*20000));
		    tot=tot+bill;
			m1();
		}
		else {
			System.out.println("tv====40000");
			//System.out.println("Electronics sections -----50000");
			System.out.println("enter quantity");
			int b=sc.nextInt();
			
			System.out.println("Electronics price is:"+(bill=b*40000));
			tot=tot+bill;
			m1();
		}
	}
	else if(a==2)
	{
    System.out.println("bath section ");
    System.out.println("1.soap\n2.bukket");
    int b1=sc.nextInt();
 if(b1==1)
  {
	  System.out.println("soap section======100");
	  System.out.println(" enter quenty");
    int cc=sc.nextInt();
    System.out.println("soap price is:"+(bill=cc*100));
    tot=tot+bill;
	m1();
 
	 }
  else {
    	  System.out.println("bukket ======300");
  
	//System.out.println("Select Bath section-----400");
	System.out.println("enter quentity");
	int c=sc.nextInt();
	System.out.println("bukket price is:"+(bill=c*300));
	tot=tot+bill;
	m1();
  }
	}
	else if(a==3)
	{
		System.out.println("kitchen section");
		System.out.println("1.cup\n2.milk");
		int d1=sc.nextInt();
		if(d1==1)
		  {
			  System.out.println("cup section======100");
			  System.out.println(" enter quenty");
		    int cc=sc.nextInt();
		    System.out.println("cup price is:"+(bill=cc*100));
		    tot=tot+bill;
			m1();
		 
			 }
		else {
			System.out.println("milk section====100");
			//System.out.println("Select kitchen section-----300");
			System.out.println("enter quentity");
			int d=sc.nextInt();
			System.out.println("kitchen price is:"+(bill=d*100));
			tot=tot+bill;
			m1();
		}	
	}
	else if(a==4)
	{
		System.out.println("cloths sections");
		System.out.println("1.saree\n 2.dress");
		int d2=sc.nextInt();
		if(d2==1)
		  {
			  System.out.println("saree section======10000");
			  System.out.println(" enter quenty");
		    int cc=sc.nextInt();
		    System.out.println("cup price is:"+(bill=cc*10000));
		    tot=tot+bill;
			m1();
		 
			 }
		else
		{
		System.out.println("dress====2000");
			//System.out.println("Select cloths section-----400");
			System.out.println("enter quentity");
			int d1=sc.nextInt();
			System.out.println("cloths price is:"+(bill=d1*2000));
			tot=tot+bill;
			m1();
		}
		
	}
	else if(a==5)
	{
		System.out.println("Others selections");
	}
	else {
		System.out.println("Invalid selections");
		Grocery();
	}
}
public void m1()
{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter 1 for continue shopping or exit");
	 int e = sc.nextInt();
	 if(e==1)
	 {
		 Grocery(); 
	 }
	 else
	 {
		 System.out.println("thnk u ");
		 System.out.println("Total bill is :"+tot);
		 System.out.println("remaning bill:"+(tot-bg));
	 }
}
public static void main(String[] args)
{
	Mart aobj=new Mart();
	System.out.println("welcome to Mart");
	aobj.Grocery();
}
}
