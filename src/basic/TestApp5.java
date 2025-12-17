package basic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		int a[][] = new int[3][4];

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = new Scanner(System.in).nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
