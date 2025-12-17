package iotopic.byteorientedway.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[] 
				{
						new Student(1,"Rahul",12),
						new Student(2,"Sagar",10),
						new Student(3,"Ankur",11)
				};
		try 
		{
			FileOutputStream fout = new FileOutputStream("iit.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s);
			
			out.close();
			fout.close();
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