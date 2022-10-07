package Sep12;

interface MyInterface 
{
public void method1();
public void method2();
}
class Demo implements MyInterface
{
	public void method1()
	{
		System.out.println("implement of method");
	}
	public void method2()
	{
		System.out.println("implement of method");
	}
	public static void main(String []args)
	{
		Demo d = new Demo();
		d.method1();
		d.method2();
	}
	
}
