package collectionfrmwrk.sortintech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "Rahul", 12);
		Student s2 = new Student(2, "Ankur", 8);
		Student s3 = new Student(3, "Sagar", 4);
		Student s4 = new Student(4, "Krunal", 9);
		Student s5 = new Student(5, "Dev", 10);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		for(int i = 0 ; i <  list.size();i++) 
		{
			Student s= list.get(i);
			s.dispData();
		}
		System.out.println("--------------------------------------");
		
		Collections.sort(list);
		
		for(int i = 0 ; i <  list.size();i++) 
		{
			Student s= list.get(i);
			s.dispData();
		}
	}
}
