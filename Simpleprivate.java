class A
{
	private int data=40;
	private void msg()
	{
		System.out.println("Hello Java");
	}
}
public class SimplePrivate
{
	public static void main(String a[])
	{
		A obj=new A();
		System.out.println(obj.data);
		obj.msg();
	}
}
