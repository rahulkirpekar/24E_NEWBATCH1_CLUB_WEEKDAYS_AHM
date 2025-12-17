package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// TestApp2.java----read-----write--->DupTestApp2.java

		try 
			(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\24E_NEWBATCH1_CLUB_WEEKDAYS_AHM\\src\\iotopic\\charorientedway\\TestApp2.java");
				FileOutputStream fout = new FileOutputStream("C:\\Users\\Royal\\eclipse-workspace\\24E_NEWBATCH1_CLUB_WEEKDAYS_AHM\\src\\iotopic\\charorientedway\\DupTestApp2.java");
			)
		{
						
			int temp;
			
			while((temp =  fin.read()) != -1) 
			{
				System.out.print((char)temp);
				
				fout.write(temp);
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
