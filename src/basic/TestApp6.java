package basic;

import java.util.Scanner;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] {9,2,8,17,3,16,5,7,8,4};
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter Index1 : ");
		int index1 = sc.nextInt();
		System.out.println("Enter Index2 : ");
		int index2 = sc.nextInt();
		
		for (int i = index1; i < index2; i++) 
		{
			for(int j=(i+1);j<a.length;j++) 
			{
				if(a[i] > a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+i+"]  : " + a[i]);	
		}	
	}
}