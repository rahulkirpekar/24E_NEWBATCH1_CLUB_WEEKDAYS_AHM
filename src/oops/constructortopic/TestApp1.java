package oops.constructortopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "Suresh", 10, 90);
		s1.dispData();
		
		Student s2 = new Student(s1);
		s2.dispData();
		
	}
}
