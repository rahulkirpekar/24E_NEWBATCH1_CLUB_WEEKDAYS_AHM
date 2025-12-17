package oops.abstopic.interfacetopic.task1;

public interface A 
{
	int NO = 10;// public static final

	public abstract void test1();// public abstract
	
// Non-Abstract Method
//-------------------------	
	// 1. static method
	
	static void test2() 
	{
		
	}
	// 2. default method
	default void test3() 
	{
		test4();
	}
	// 3. private method
	private void test4() 
	{
		System.out.println("test4()---private");
	}
}
