package collectionfrmwrk.sortintech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(9);
		list.add(5);
		list.add(2);
		list.add(11);
		list.add(3);
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("list.get("+i+") : " + list.get(i));
		}
		
		System.out.println("-----------------------------");
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("list.get("+i+") : " + list.get(i));
		}
		
	}
}




