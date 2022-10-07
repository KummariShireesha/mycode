package Test;

public class MaxminArray
{
public static void main(String []args)
{
	int[] a=new int[] {2,4,5,6};
	for(int a1:a) {
		System.out.println(a);
		
	}
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(min>a[i])
		{
			min=a[i];
		
		}
		System.out.println("minum number:"+min);
	}

}
}
