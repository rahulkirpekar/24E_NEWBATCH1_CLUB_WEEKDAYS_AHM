package collectionfrmwrk.settopic;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Maintain Insertion order
		LinkedHashSet<String>list = new LinkedHashSet<String>();
		
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
