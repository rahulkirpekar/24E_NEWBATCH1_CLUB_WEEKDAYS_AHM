package iotopic.byteorientedway.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Rahul",12);
		s1.dispData();
	
		// Data---s1(object)---write---File
		try (
				FileOutputStream fout = new FileOutputStream("listrecords.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(s1);
		
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
