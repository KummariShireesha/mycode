package Sep21;

public class Array 
{
	int i,j;
 static int arr[][]=  new int[3][3];
public void m1()
{
	for(i=0;i<arr.length;i++)
	{
		for(j=0;j<arr.length;j++) 
		{
			if(arr[i]==arr[j])
			{
			m1();	
			}
		}
	}
}
public static void main(System []args)
{
	//Array aobj=new Array();
	//aobj.m1();
}
}
