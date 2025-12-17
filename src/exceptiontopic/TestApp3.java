package exceptiontopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String name = null;
		
		try 
		{
//			System.exit(1);// JVM Execution Stop			
			System.out.println(name.length());// raise exception
		}
		/*catch (ArithmeticException e) 
		{
			System.out.println("Catch Block Handled Exception");
			e.printStackTrace();
		}*/
		finally 
		{
			// close --- file connection /Db connection / Socket
			System.out.println("Finally Block");
		}
		System.out.println("===General Statement====");
	}
}
