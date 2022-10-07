package Test;

public class Secondhight
{

 public static void main(String []args) 
 {
	int temp;
	int arr[]= {2,4,6,7,8};
	
	for(int i=0;i< arr.length;i++)
	{
	for(int j=i+1;i<arr.length;j++) 
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	}
	System.out.println(arr[0]);
 }

		 
	

}
 