package oct4;

import java.util.Scanner;

public class Grocery 
{
static double totalPrice;
static double totalCost1;
static double totalCost2;
static double totalCost3;
static double totalCost4;
static double totalCost5;
static double totalCost6;
static double totalCost7;
static double totalCost8;
static double totalCost9;
static double Budget;
public static void choice()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your chice");
	System.out.println("1.Electronics"+"\n"+"2.Bath"+" \n"+"3.kitchen"+"\n"+"4.cloths"+"\n"+"5.others");
	int choice =sc.nextInt();
	System.out.println("enter your Burget:");
	double Budget=sc.nextDouble();
	switch(choice)
	{
	case 1:
		System.out.println("welcome to Electronics store");
		elsectronicItems();
		break;
	case 2:
		System.out.println("welcome to Bath store");
		bathStore();
		break;
	case 3:
		System.out.println("welcome to kitchen store");
		kitchenStore();
		break;
	case 4:
		System.out.println("welcome to cloths store");
		clothsStore();
		break;
	case 5:
		System.out.println("welcome to other store");
		otherStore();
		break;
	}
}
private static void otherStore()
{
System.out.println("select what do you want:"+"\n"+"1.mobile"+"2.tv"+"\n"+"3.exit");
Scanner sc1=new Scanner(System.in);
int select=sc1.nextInt();
if(select==1)
{
	int itemid=123;
	long itemCost=20000;
	int totalStock=10;
	System.out.println("itemid is :"+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
	Scanner sc2=new Scanner(System.in);
	int want=sc2.nextInt();
	int aValQty=totalStock-wait();
}
}
private static void clothsStore() {
	// TODO Auto-generated method stub
	
}
private static void kitchenStore() {
	// TODO Auto-generated method stub
	
}
private static void bathStore() {
	// TODO Auto-generated method stub
	
}
private static void elsectronicItems() {
	// TODO Auto-generated method stub
	
}
}
