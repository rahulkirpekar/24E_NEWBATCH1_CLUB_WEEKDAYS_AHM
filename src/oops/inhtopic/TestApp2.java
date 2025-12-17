package oops.inhtopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Sagar", 10);
		s1.dispData();

		Employee e1 = new Employee(1, "Ankur", "Dr");
		
		System.out.println(e1.getId()+" " +e1.getName()+" " + e1.getDsgn());
	}
}
