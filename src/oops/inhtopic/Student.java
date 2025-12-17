package oops.inhtopic;

public class Student extends Person
{
	int rno,std;
	
	public Student(){}
	public Student(int rno,String name,int std)
	{
		this.rno=rno;
		this.name=name;
		this.std = std;
	}
	void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
}
