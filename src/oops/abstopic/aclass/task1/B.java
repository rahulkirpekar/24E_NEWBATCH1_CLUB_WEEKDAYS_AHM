package oops.abstopic.aclass.task1;

public class B extends A
{
	@Override
	public void test1() 
	{
		System.out.println("B--test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("B--test2()");
	}
	@Override
	public void test3() 
	{
		System.out.println("B--test3()");
	}
	
	public static void main(String[] args) 
	{
		A obj = new B();
		
		obj.test1();
		obj.test2();
		obj.test3();
	}
}
