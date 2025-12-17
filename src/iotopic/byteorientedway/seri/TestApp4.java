package iotopic.byteorientedway.seri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\24E_NEWBATCH1_CLUB_WEEKDAYS_AHM\\iit.txt");
		
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student s[] = 	(Student[])oin.readObject();
		
			for (int i = 0; i < s.length; i++) 
			{
				s[i].dispData();
			}
			
			oin.close();
			fin.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
