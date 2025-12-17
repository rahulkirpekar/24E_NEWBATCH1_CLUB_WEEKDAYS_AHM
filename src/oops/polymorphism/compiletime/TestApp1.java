package oops.polymorphism.compiletime;

public class TestApp1 
{
	public static void addFun(double no1,double no2) 
	{
		System.out.println("addFun(double no1,double no2) : " + (no1+no2));
	}
	public static void addFun(short no1,short no2) 
	{
		System.out.println("addFun(short no1,short no2) : " + (no1+no2));
	}
	
	public static void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(int no1,int no2,int no3) : " + (no1+no2+no3));
	}
	public static void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4) : " + (no1+no2+no3+no4));
	}
	
	public static void main(String[] args) 
	{
		
		addFun(10,20);
//		addFun(20.56f, 10.19087f);
		
//		addFun(20, 10,30);
//		addFun(20, 10,30,40);
	}
}
/*
Method Overloadding:-
----------------------
	1. DataType same -- Arguments count different
	2. exact DataType Match
	3. Type pramotion rule
	
Type pramotion rule:-
-----------------------

	boolean-----X

			byte
			 |	
			short
			 |
char------->int
			 |
			long 
			 |
			float 
			 |
			double 
			  
			  
			  	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*/