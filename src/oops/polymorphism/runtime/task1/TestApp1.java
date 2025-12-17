package oops.polymorphism.runtime.task1;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// reference Type
		//  |
		// Home home --> reference variable
		
//		Home home = new Home();
		// new --Heap object create
		// Home()--Heap type object create
//		home.getBehave();
		
		
		// Upcasting
		// Late Binding / Dynamic Binding / Runtime Polymorphism
		// Polymorphisc Object
		Person person = new Home();
		person.getBehave();// Home---child
	
		
		person = new PublicPlace();
		person.getBehave();// PublicPlace---Citizen
		
		
		person = new School();
		person.getBehave();// School---Student
		
		
		person = new Org();
		person.getBehave();// Org---Employee
		
	
	}
}
