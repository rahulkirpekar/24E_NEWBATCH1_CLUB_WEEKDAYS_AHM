package oops.abstopic.aclass.task2;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter below choice of Vehicle : ");
		System.out.println("1) For TwVehicle");
		System.out.println("2) For LmvVehicle");
		System.out.println("3) For HmvVehicle");
		int choice= new Scanner(System.in).nextInt();
		
		Vehicle vehicle = null;
		switch (choice) 
		{
			case 1: // Upcasting---Polymorphic Object
					// Runtime Polymorphism 
					// Late Binding
					// Dynamci Binding
					vehicle = new TwVehicle();
					vehicle.getSpec();
				 	break;
				 	
			case 2: vehicle = new LmvVehicle();
					vehicle.getSpec();
				 	break;
				 	
			case 3: vehicle = new HmvVehicle();
					vehicle.getSpec();
				 	break;
		}
	}
}
