package sep16;

	import java.util.*;
	public class Main
	{
		public static int count=1;
	    public static double onion = 56.5;
	    public static int tom=30;
	    public static int car=60;
	    public static double lf=45;
	    public static int bri = 35;
	    public static  char q;
	    public static int v;
	    public static int c=0;
		public static void vegi()
		{
			Scanner sc = new Scanner(System.in);
	        
	        System.out.println("1.onion "+onion);
	        System.out.println("2.Tomato "+tom);
	        System.out.println("3.Carrot "+car);
	        System.out.println("4.Ladies Finger "+lf);
	        System.out.println("5.Brinjal "+bri);
	        v=sc.nextInt();
	        if(v==1)
	        {
	        	Onion.oni();
	        }
	        else if(v==2)
	        {
	        	Onion.tomato();
	        }
	        else if(v==3)
	        {
	        	Onion.carrot();
	        }
	        else if(v==4)
	        {
	        	Onion.ladiesFinger();
	        }
	        else if(v==5)
	        {
	        	Onion.brinjal();
	        }
	        else
	        {
	        	System.out.println("Please select valid input");
	        	vegi();
	        }
		}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);System.out.printf("Please Select the Vegitable per KG given below with price \n");
			vegi();
		}

	}
	class Onion
	{
		public static int count=1;
	    public static double onion = 56.5;
	    public static int tom=30;
	    public static int car=60;
	    public static double lf=45;
	    public static int bri = 35;
	    public static  char q;
	    public static int v;
	    public static int c;
	    public static void count()
	    {
	    	if(c==1)
	    	{
	    		System.out.println("The final bill will be "+onion);
	    	}
	    	else if(c==2)
	    	{
	    		System.out.println("The final bill will be "+(onion*1));
	    	}
	    	else if(c==3)
	    	{
	    		System.out.println("The final bill will be "+(onion*2));
	    	}
	    	else if(c==4)
	    	{
	    		System.out.println("The final bill will be "+(onion*3));
	    	}
	    	else if(c==5)
	    	{
	    		System.out.println("The final bill will be "+(onion*4));
	    	}
	    	else if(c==6)
	    	{
	    		System.out.println("The final bill will be "+(onion*5));
	    	}
	    	else if(c==7)
	    	{
	    		System.out.println("The final bill will be "+(onion*6));
	    	}
	    	else
	    	{
	    		System.out.println("No Stock");
	    	}
	    }
	    public static void oni()
	    {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Please Select the quantity : ");
	         System.out.println("We have stock on 15KG's on each Item please select below 15kg's");
	        System.out.println("a.0.5kg\nb.1kg\nc.2kg\nd.3kg");
	        q = sc.next().charAt(0);
	        if(q=='a')
	        {
	        System.out.println("You are selected 0.5kg your Price is "+((onion)/2));
	        c++;
	        System.out.println("Press 1 for to continue any number for exit");
	        int c = sc.nextInt();
	        if(c==1)
	        {
	        	Main.vegi();
	        }
	        else
	        {
	        	count();
	        	System.out.println("Thank you visit again");
	        }
	        }
	        else if(q=='b')
	        {
	        	System.out.println("You are selected 1kg your Price is "+(onion));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='c')
	        {
	        	System.out.println("You are selected 2kg your Price is "+((onion)*2));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='d')
	        {
	        	System.out.println("You are selected 3kg your Price is "+((onion)*3));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else
	        {
	        	System.out.println("Please select valid input");
	        }
	    }
	    public static void tomato()
	    {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Please Select the quantity : ");
	         System.out.println("We have stock on 15KG's on each Item please select below 15kg's");
	        System.out.println("a.0.5kg\nb.1kg\nc.2kg\nd.3kg");
	        q = sc.next().charAt(0);
	        if(q=='a')
	        {
	        	System.out.println("You are selected 0.5kg your Price is "+((tom)/2));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='b')
	        {
	        	System.out.println("You are selected 1kg your Price is "+(tom));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='c')
	        {
	        	System.out.println("You are selected 2kg your Price is "+((tom)*2));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='d')
	        {
	        	System.out.println("You are selected 3kg your Price is "+((tom)*3));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else
	        {
	        	System.out.println("Please select valid input");
	        }
	    }
	    public static void carrot()
	    {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Please Select the quantity : ");
	         System.out.println("We have stock on 15KG's on each Item please select below 15kg's");
	        System.out.println("a.0.5kg\nb.1kg\nc.2kg\nd.3kg");
	        q = sc.next().charAt(0);
	        if(q=='a')
	        {
	        	System.out.println("You are selected 0.5kg your Price is "+((car)/2));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='b')
	        {
	        	System.out.println("You are selected 1kg your Price is "+(car));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='c')
	        {
	        	System.out.println("You are selected 2kg your Price is "+((car)*2));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='d')
	        {
	        	System.out.println("You are selected 3kg your Price is "+((car)*3));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else
	        {
	        	System.out.println("Please select valid input");
	        }
	    }
	    public static void ladiesFinger()
	    {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Please Select the quantity : ");
	         System.out.println("We have stock on 15KG's on each Item please select below 15kg's");
	        System.out.println("a.0.5kg\nb.1kg\nc.2kg\nd.3kg");
	        q = sc.next().charAt(0);
	        if(q=='a')
	        {
	        	System.out.println("You are selected 0.5kg your Price is "+((lf)/2));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='b')
	        {
	        	System.out.println("You are selected 1kg your Price is "+(lf));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='c')
	        {
	        	System.out.println("You are selected 2kg your Price is "+((lf)*2));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='d')
	        {
	        	System.out.println("You are selected 3kg your Price is "+((lf)*3));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	            
	        }
	        else
	        {
	        	System.out.println("Please select valid input");
	        }
	    }
	    public static void brinjal()
	    {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Please Select the quantity : ");
	         System.out.println("We have stock on 15KG's on each Item please select below 15kg's");
	        System.out.println("a.0.5kg\nb.1kg\nc.2kg\nd.3kg");
	        q = sc.next().charAt(0);
	        if(q=='a')
	        {
	        	System.out.println("You are selected 0.5kg your Price is "+((bri)/2));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='b')
	        {
	        	System.out.println("You are selected 1kg your Price is "+(bri));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='c')
	        {
	        	System.out.println("You are selected 2kg your Price is "+((bri)*2));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else if(q=='d')
	        {
	        	System.out.println("You are selected 3kg your Price is "+((bri)*3));
	        	c++;
	        	System.out.println("Press 1 for to continue any number for exit");
	            int c = sc.nextInt();
	            if(c==1)
	            {
	            	Main.vegi();
	            }
	            else
	            {
	            	count();
	            	System.out.println("Thank you visit again");
	            }
	        }
	        else
	        {
	        	System.out.println("Please select valid input");
	        }
	    }
  
	}



