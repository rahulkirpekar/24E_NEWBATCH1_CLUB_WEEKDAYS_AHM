package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : "); 
		int no1 =  sc.nextInt();
		System.out.println("Enter No2 : "); 
		int no2 =  sc.nextInt();
		
		
		System.out.println("Enter below choice : ");
		System.out.println("+ For Addition");
		System.out.println("- For Addition");
		System.out.println("* For Addition");
		System.out.println("/ For Addition");
		char choice = sc.next().charAt(0);// +

		int ans = 0;
		
		switch (choice) 
		{
			case '+': ans = no1+no2;
					  System.out.println("Addition : " + ans);
					  break;
					  
			case '-': ans = no1-no2;
			  		  System.out.println("Subtraction : " + ans);
					  break;
					  
			case '*':ans = no1*no2;
	  		  		 System.out.println("Multiply : " + ans);
					 break;
					 
			case '/':ans = no1/no2;
		  		 	 System.out.println("Division : " + ans);
					 break;
					
			default:
					break;
		}
	}
}
