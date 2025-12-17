package oops.classobj;

public class TestApp1 
{
	// 2. Mf's
	public static void main(String[] args) 
	{
		// Data--store--object(dm's--private , Mf's--public)

		Student s1= new Student();
		
		s1.setRno(1);
		s1.setName("Ankur");
		s1.setStd(12);
		s1.setMarks(100);
		
		System.out.println(s1.getRno()+" "+s1.getName()+" " + s1.getStd()+" " + s1.getMarks());
		
		// obj--reference variable
		// Student--ClassName
//		Student obj1 = new Student();
//		Student obj2 = new Student();
		
		
//		Student s[] = new Student[5];
//		for (int i = 0; i < s.length; i++) 
//		{
//			s[i] = new Student();
//			s[i].scanData();
//			
//		}
//		for (int i = 0; i < s.length; i++) 
//		{
//			s[i].dispData();
//		}
	}
}