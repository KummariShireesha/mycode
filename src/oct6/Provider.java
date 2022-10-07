package oct6;

import java.util.Scanner;
public class Provider
{
	static Scanner sc = new Scanner(System.in);
	private static Object product;
	private static String productid;
    public static void operations()
    {
        System.out.println("Enter \n1.pro\n2.kitchen\n3.bath\n4.cloths");
        int n = sc.nextInt();
        if(n==1)
        {
        System.out.println("pro");
        Provider.proData();
        }
        else if(n==2)
        {
        System.out.println("kitchen ");
        Provider.kitchendata();
        }
        else if(n==3)
        {
            bathData();
            System.out.println("bath");
        }
        else if(n==4)
        {
        	clothsData();
            System.out.println("cloths");
        }
        else
        {
            System.out.println("Invalid selection\nSelect again");
            operations();
        }
    }
//	private static void clothsData() {
//		System.out.println("====addData====");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter your id");
//		String un=sc.next();
//		System.out.println("enter your name");
//		String password=sc.next();
//		Product pdct=new Product();
//	pdct.setName(un);
//	pdct	.setproductid(productid);
//		Productinfo service=new Productinfo();
//		service.addproduct(product);
//
//	}
//	private static void bathData() {
//		// TODO Auto-generated method stub
//		
//	}
//	private static void kitchendata() {
//		// TODO Auto-generated method stub
//		
//	}
//	private static void proData() {
//		// TODO Auto-generated method stub
//		
//	}
	
}
