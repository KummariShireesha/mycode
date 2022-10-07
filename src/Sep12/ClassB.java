package Sep12;

public class ClassB
{
public void m1()
{
	System.out.println("hello classB");
}
class ClassC extends ClassB
{
	public void m2()
	{
	System.out.println("hii classC");
}

}
public static void main(String []args)
{
	ClassB aobj=new ClassB();
	aobj.m1();
	
}
}