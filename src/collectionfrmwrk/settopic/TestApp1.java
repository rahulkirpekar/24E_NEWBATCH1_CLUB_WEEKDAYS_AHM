package collectionfrmwrk.settopic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Not maintain Insertion order
		HashSet<String>list = new HashSet<String>();
		
		list.add("royal");//0
		list.add("sagar");//3
		list.add("ramesh");//4
		list.add("kunal");//5
		list.add("rahul");//1
		list.add("rakesh");//2
		list.add("sagar");//3
		list.add("ramesh");//4
		list.add("kunal");//5
		
		Iterator<String> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
