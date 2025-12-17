package stringtopic.byimmutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		1. By String literal way [ RAM---->"HEAP"----->SCP--[String Constant Pool] ]:-
//		---------------------------------------------------------------------------

			String name1 = "royal";
			String name2 = "technosoft";
			String name3 = name1;
			String name4 = "royal";

					//royaltechnosoft
			String name5 = name1 + name2;// royaltechnosoft

			String name6 = "technosoft";

			System.out.println("String Object Equality : ");
			System.out.println("---------------------------");
			
			
//	String Object Equality:-
//	------------------------
//		1. referenceBased(==)			
//		----------------------			
		System.out.println("\n\t1. referenceBased(==) : ");
		System.out.println("---------------------------");
		System.out.println(name1==name2);//false		
		System.out.println(name1==name3);//true		
		System.out.println(name1==name4);//true		
		System.out.println(name1==name5);//false		
		System.out.println(name1==name6);//false		
		System.out.println(name2==name6);//true		
		
//		2. valueBased(equals())               
//		------------------------              
		System.out.println("\n\t1. valueBased(equals()) : ");
		System.out.println("---------------------------");
		System.out.println(name1.equals(name2));// false     
		System.out.println(name1.equals(name3));// true      
		System.out.println(name1.equals(name4));// true      
		System.out.println(name1.equals(name5));// false     
		System.out.println(name1.equals(name6));// false     
		System.out.println(name2.equals(name6));// true      
	}
}
