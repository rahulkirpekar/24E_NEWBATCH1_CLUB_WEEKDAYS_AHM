package innerclasstopic.ni;

//Innerclass:-
//------------
//	1. Member Innerclass
//	2. Anonymous Innerclass
//	3. Local Innerclass
//	4. Nested Innerclass

public class A 
{
	private static int  no = 100;

	// Nested Innerclass
	static class B
	{
		void disp() 
		{
			System.out.println("No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A.B obj = new A.B();
		obj.disp();
	}
}
