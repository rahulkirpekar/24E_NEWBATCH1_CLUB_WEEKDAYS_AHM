package exceptiontopic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();// 2

		int ans =0;

		try 
		{
			ans = no1 / no2;// code crashed
			
			int a[] = new int[5];// a[0],a[1],a[2],a[3],a[4]
			a[5] = 100;// ArrayIndexoutofBoundException

			
			String name = "royal";
			System.out.println(name.charAt(5));// StringIndexoutofBoundException
			
		}
		catch(NullPointerException | ArithmeticException e) 
		{
			e.printStackTrace();// object class + RootCause + Raise Code Line
			ans = 0;
			System.out.println(e.getClass().getName() + " ---Exception handled By catch Block");
		} catch (Exception e) {
			e.printStackTrace();// object class + RootCause + Raise Code Line
			ans = 0;
			System.out.println("Exception---Exception handled By catch Block");
		}
	}
}
