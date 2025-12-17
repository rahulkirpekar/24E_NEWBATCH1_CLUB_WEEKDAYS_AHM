package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
		2. Byte oriented way
		----------------------
			1. FileOutpuStream(write)	
			2. FileInputStream(read)
*/
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// ABC
		
		// String-- byte----write----text file
		byte b[] = name.getBytes();// 65 66 67
		
		try 
		{
			// 1. Open File Connection
			FileOutputStream  fout = new FileOutputStream("list.txt");
			
			// 2. Operation---write
			fout.write(b);
			
			// 3. Close File Connection
			fout.close();
			
			System.out.println("Success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
