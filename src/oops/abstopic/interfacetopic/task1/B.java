package oops.abstopic.interfacetopic.task1;

public class B implements A 
{
	public static void main(String[] args) 
	{
		A.test2();
		
		B obj = new B();
		
		obj.test3();
		obj.test1();
		
	}
	@Override
	public void test1() 
	{
	}
}
