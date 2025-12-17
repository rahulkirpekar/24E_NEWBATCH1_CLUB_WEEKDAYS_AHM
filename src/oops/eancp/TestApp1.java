package oops.eancp;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Data ---Store--[Data Members]
		Student s= new Student();
		
		s.setRno(1);
		s.setName("Ankur");
		s.setStd(12);

		System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd());
		
//		s.rno=1;
//		s.name="rahul";
//		s.std=12;
//		System.out.println(s.rno+" " + s.name+" " + s.std);
		
	}
}
