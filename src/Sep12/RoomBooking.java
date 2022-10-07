package Sep12;
import java.util.*;
public class RoomBooking{
	public static class Bill{
		public static int hac1=2000;
		public static int hnonac1=1500;
		public static int h2ac2=2500;
		public static int h2nonac2=1500;
		public static int v1=1000;
		public static int v2=1500;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Bill aobj =new Bill();
		System.out.println(" Room Booking System");
		System.out.println("Enter the location you want to book");
		String[] city = new String[2];
		city[0]="pune";
		city[1]="Goa";
		System.out.println("Enter the name of the city correctly given below\n1.pune\n2.Goa");
		String city1 = sc.next();
		if(city1.equals(city[0])){
			System.out.println("=====Welcome to pune======");
			System.out.println("Please select the Hotel...");
			System.out.println("\n1.5 star\n2.Taj hotel");
			int ht = sc.nextInt();
			if(ht==1){
				System.out.println(" enter the room type:\n1.AC\n2.NON-AC");
				int ac = sc.nextInt();
				if(ac==1){
					System.out.println("You are selected ==AC== room With cost :"+(Bill.hac1));
					System.out.println("");
					System.out.println(" enter the view from room:\n1.Mountain\n2.Pool");
					int vi= sc.nextInt();
					if(vi==1){
					System.out.println("you are seleted ===Mountain=== view");
					System.out.println(" select the no of members in your family");
					int mem = sc.nextInt();
					if (mem>0&&mem<=4){
						System.out.print(" enter the no of Childrens who are having age below 12 :");
						int ch = sc.nextInt();
						if(ch<=2&&ch>0){
							System.out.println("your room is booked on mountain view with the cost of "+Bill.v1+Bill.hac1);
						}
						else{
							System.out.println("Your room is booked on mountain view with extra cost of "+(Bill.v1+750+Bill.hac1));
						}}
					else{
						System.out.println("you have More than 4 members in your family you have want to take extra room with extra payment ");
						System.out.println("Press y from confirm booking");
						String ok1="y";
						String ok = sc.next();
						if(ok1.contentEquals(ok)){
							System.out.println("your room is booked with the cost of"+(Bill.hac1+Bill.v1+500));
						}
						else{
							System.out.println("Your booking is not happened right now");
						}}}
					else{
						System.out.println("You are Selected ==Pool== view");
						System.out.println(" select the no of members in your family");
						int mem = sc.nextInt();
						if (mem>0&&mem<=4){
							System.out.print(" enter the no of Childrens who are having age below 12 :");
							int ch = sc.nextInt();
							if(ch<=2&&ch>0){
								System.out.println("Your room is booked on Pool view with the cost of "+(Bill.v2+Bill.hac1+350));
							}
							else{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2+Bill.hac1)+(750)));
							}}
						else{
							System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
							System.out.println("Press y from confirm booking");
							String ok1="y";
							String ok = sc.next();
							if(ok1.contentEquals(ok)){
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2+Bill.hac1)+(750)));
							}
							else{
								System.out.println("Your booking is not happened right now");
							}}}}
				else{
					System.out.println("You are selected NON-AC room with cost:"+Bill.hnonac1);
					System.out.println("");
					System.out.println(" enter the View from room:\n1.Mountain\n2.Pool");
					int vi= sc.nextInt();
					if(vi==1){
					System.out.println("You are Selected Mountain view");
					System.out.println(" select the no of members in your family");
					int mem = sc.nextInt();
					if (mem>0&&mem<=4){
						System.out.print(" enter the no of Childrens who are having age below 12 :");
						int ch = sc.nextInt();
						if(ch<=2&&ch>0){
							System.out.println("Your room is booked on mountain view with the cost of "+(Bill.hnonac1+Bill.h2ac2+Bill.v2));
						}
						else{
							System.out.println("Your room is booked on mountain view with extra cost of "+(Bill.hnonac1+750+Bill.hac1+500));
						}}
					else{
						System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
						System.out.println("Press y from confirm booking");
						String ok1="y";
						String ok = sc.next();
						if(ok1.contentEquals(ok)){
							System.out.println("Your room is booked with the cost of "+(Bill.hac1+Bill.v1+500));
						}
						else{
							System.out.println("Your booking is not happened right now");
						}}}
					
					else{
						System.out.println("You are Selected Pool view");
						System.out.println(" select the no of members in your family");
						int mem = sc.nextInt();
						if (mem>0&&mem<=4){
							System.out.print(" enter the no of Childrens who are having age below 12 :");
							int ch = sc.nextInt();
							if(ch<=2&&ch>0){
								System.out.println("Your room is booked on Pool view with the cost of "+(Bill.h2nonac2+500+Bill.v2));
							}
							else{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.h2nonac2)+(750)+(Bill.v1)+500));
							}}
						else{
							System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
							System.out.println("Press y from confirm booking");
							String ok1="y";
							String ok = sc.next();
							if(ok1.contentEquals(ok)){
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2)+(750)));
							}
							else{
								System.out.println("Your booking is not happened right now");
							}}}}}}
		if(city1.equals(city[1])){
			System.out.println("=====Welcome to Goa======");
			System.out.println("Please select the Hotel..");
			System.out.println("\n1.ITC Kohinoor\n2.Hotel Taj");
			int ht = sc.nextInt();
			if(ht==1){
				System.out.println("Please enter the room type:\n1.AC\n2.NON-AC");
				int ac = sc.nextInt();
				if(ac==1){
					System.out.println("You are selected ==AC== room With cost :"+(Bill.hac1));
					System.out.println("");
					System.out.println(" enter the View from room:\n1.Mountain\n2.Pool");
					int vi= sc.nextInt();
					if(vi==1){
					System.out.println("You are Selected ==Mountain== view");
					System.out.println("please select the no of members in your family");
					int mem = sc.nextInt();
					if (mem>0&&mem<=4){
						System.out.print(" enter the no of Childrens who are having age below 12 :");
						int ch = sc.nextInt();
						if(ch<=2&&ch>0){
							System.out.println("Your room is booked on mountain view with the cost of "+Bill.v1);
						}
						else{
							System.out.println("Your room is booked on mountain view with extra cost of "+(Bill.v1+750));
				}	}
					else{
						System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
						System.out.println("Press y from confirm booking");
						String ok1="y";
						String ok = sc.next();
						if(ok1.contentEquals(ok)){
							System.out.println("Your room is booked");
						}
						else{
							System.out.println("Your booking is not happened right now");
						}}}
					else{
						System.out.println("You are Selected ==Pool== view");
						System.out.println("please select the no of members in your family");
						int mem = sc.nextInt();
						if (mem>0&&mem<=4){
							System.out.print(" enter the no of Childrens who are having age below 12 :");
							int ch = sc.nextInt();
							if(ch<=2&&ch>0){
								System.out.println("Your room is booked on Pool view with the cost of "+Bill.v2);
							}
							else{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2)+(750)));
							}}
						else{
							System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
							System.out.println("Press y from confirm booking");
							String ok1="y";
							String ok = sc.next();
							if(ok1.contentEquals(ok)){
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2)+(750)));
							}
							else{
								System.out.println("Your booking is not happened right now");
							}}}}
				else{
					System.out.println("You are selected NON-AC room with cost:"+Bill.hnonac1);
					System.out.println("");
					System.out.println("Please enter the View from room:\n1.Mountain\n2.Pool");
					int vi= sc.nextInt();
					if(vi==1){
					System.out.println("You are Selected Mountain view");
					System.out.println("please select the no of members in your family");
					int mem = sc.nextInt();
					if (mem>0&&mem<=4){
						System.out.print(" enter the no of Childrens who are having age below 12 :");
						int ch = sc.nextInt();
						if(ch<=2&&ch>0){
							System.out.println("Your room is booked on mountain view with the cost of "+Bill.hnonac1);
						}
						else{
							System.out.println("Your room is booked on mountain view with extra cost of "+(Bill.hnonac1+750));
						}}
					else{
						System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
						System.out.println("Press y from confirm booking");
						String ok1="y";
						String ok = sc.next();
						if(ok1.contentEquals(ok)){
							System.out.println("Your room is booked");
						}
						else{
							System.out.println("Your booking is not happened right now");
						}}}
					else{
						System.out.println("You are Selected Pool view");
						System.out.println("select the no of members in your family");
						int mem = sc.nextInt();
						if (mem>0&&mem<=4){
							System.out.print(" enter the no of Childrens who are having age below 12 :");
							int ch = sc.nextInt();
							if(ch<=2&&ch>0){
								System.out.println("Your room is booked on Pool view with the cost of "+Bill.h2nonac2);
							}
							else{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.h2nonac2)+(750)));
							}}
						else{
							System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
							System.out.println("Press y from confirm booking");
							String ok1="y";
							String ok = sc.next();
							if(ok1.contentEquals(ok)){
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2)+(750)));
							}
							else{
								System.out.println("Your booking is not happened right now");
							}}}}}}}}

