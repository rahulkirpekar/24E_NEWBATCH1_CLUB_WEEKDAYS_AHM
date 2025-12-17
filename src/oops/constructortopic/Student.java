package oops.constructortopic;

import java.util.Scanner;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	// 1.Default Constructor
	public Student()
	{
		System.out.println("START :: Default Constructor");
		rno=1;
		name="Rahul";
		std=12;
		marks=100;
		System.out.println("EXIT :: Default Constructor");
	}
	
	// 2.Para Constructor + 3.Copy Constructor
	public Student(int rno,String name, int std,int marks)
	{
		System.out.println("START :: Para Constructor");
		this.rno=rno;
		this.name=name;
		this.std=std;
		this.marks=marks;
		System.out.println("EXIT :: Para Constructor");
	}
	
	public Student(Student s)
	{
		System.out.println("START :: Copy Constructor");
		this.rno=s.rno;
		this.name=s.name;
		this.std=s.std;
		this.marks=s.marks;
		System.out.println("EXIT :: Copy Constructor");
	}
	
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " +std+" " + marks);
	}
}
