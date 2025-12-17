package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
				(
						FileReader fr= new FileReader("C:\\Users\\Royal\\eclipse-workspace\\24E_NEWBATCH1_CLUB_WEEKDAYS_AHM\\royal.txt");
				)
		{
			int temp;
			
			while((temp = fr.read()) != -1) 
			{
				System.out.print((char)temp);
			}
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}