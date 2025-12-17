package basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		int l=2,no,range;
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		range = sc.nextInt();
		
		
		for (int i = 1; i <=range; i++) 
		{
			for (int k = (range-i); k >=1; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i; ) 
			{
				no = l;
				flag = true;
				for(int m = 2 ; m < no ; m++) 
				{
					if(no%m == 0) 
					{
						flag = false;
						break;
					}
				}
				if(flag) 
				{
					System.out.print(no+" ");
					j++;
				}
				l++;
			}
			System.out.println();
		}
		for (int i = (range-1); i >=1; i--) 
		{
			for (int k = (range-i); k >=1; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i;) 
			{
				no = l;
				flag = true;
				for(int m = 2 ; m < no ; m++) 
				{
					if(no%m == 0) 
					{
						flag = false;
						break;
					}
				}
				if(flag) 
				{
					System.out.print(no+" ");
					j++;
				}
				l++;
			}
			System.out.println();
		}
	}
}