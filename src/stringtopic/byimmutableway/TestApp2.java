package stringtopic.byimmutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		2.By new Keyword way:-[ RAM---->"HEAP"]
//		-------------------------------------------------
				
		String name1 = new String("royal");
		String name2 = new String("technosoft");
		String name3 = new String("royal");
		String name4 = name1;


//		1. referenceBased(==)			
//		----------------------			
		
		System.out.println("2. referenceBased(==)  ");             
		System.out.println("------------------------ ");
		System.out.println(name1==name2);// false		
		System.out.println(name1==name3);// false		
		System.out.println(name1==name4);// true		

		// 2. valueBased(equals())
		//--------------------------
		System.out.println("2. valueBased(equals())  ");             
		System.out.println("------------------------ ");             
		System.out.println(name1.equals(name2));// false     
		System.out.println(name1.equals(name3));// true      
		System.out.println(name1.equals(name4));// true      
		
		
	}

}
