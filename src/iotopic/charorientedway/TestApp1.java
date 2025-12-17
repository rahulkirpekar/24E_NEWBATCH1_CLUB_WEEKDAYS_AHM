package iotopic.charorientedway;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 		1. Character oriented way
		-----------------------------
			1. FileWriter(write)
			2. FileReader(read)	
 */
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// ABC

		try 
			(
				FileWriter fw = new FileWriter("royal.txt");
			)
		{
			fw.write(name);

			System.out.println("success");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}
}
