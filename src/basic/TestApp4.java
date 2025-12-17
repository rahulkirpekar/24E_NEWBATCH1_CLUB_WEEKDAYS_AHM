package basic;

import java.util.Scanner;

public class TestApp4 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)  
	{
//		Array:-
//		--------
			int sum = 0;
			int a1[] = new int[5];
			
			System.out.println("a1.length :  " + a1.length);

			for (int i = 0; i < a1.length; i++) 
			{
				System.out.println("Enter A["+ i +"] : ");
				a1[i] = new Scanner(System.in).nextInt();
			}

			for (int i = 0; i < a1.length; i++) 
			{
				sum += a1[i];
				System.out.println("A["+ i +"] : " + a1[i]);
			}			
			
			System.out.println("Sum : " + sum);
			
//			int []a2 = new int[5];
//			int[] a3 = new int[5];
//			int [] a4 = new int[5];
//			int [] a5 = new int[]{10,20,30,40,50};
//			int [] a6 = {10,20,30,40,50};		
	}
}