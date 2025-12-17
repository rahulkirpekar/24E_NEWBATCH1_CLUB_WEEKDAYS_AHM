package exceptiontopic;

import java.util.Scanner;

public class TestApp4 
{
	public static void isValidAgeForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception 
					// 1. Checked Exception--compiletime===>Compiler
//			throw new IOException("\nInvalid Age,\n\tPlease enter valid Age for Vote.");	
			
					// 2. UnChecked Exception---JVM--Runtime
//			throw new ArithmeticException("\nInvalid Age,\n\tPlease enter valid Age for Vote.");	
			
			// Custom Exception ---checked type
//			throw new InvalidAgeException("\n\"Invalid Age,\n\tPlease enter valid Age for Vote.\"");
			
			
			// Custom Exception ---Unchecked type
			throw new InvalidAgeException("\n\"Invalid Age,\n\tPlease enter valid Age for Vote.\"");
						
		}
		else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();
		
		isValidAgeForVote(age);
		
		System.out.println("=====General Statement=====");
	}
}
