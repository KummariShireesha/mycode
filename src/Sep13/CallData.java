package Sep13;


public class CallData
{
public Object show()
{
	int a,b,c;
	a=40;
	b=20;
	c=a/b;
	return c ;
}
public static class TestobjectClass
{
	public static void main(String []args)
	{
		CallData data=new CallData();
		data.show();
	}
}
}
