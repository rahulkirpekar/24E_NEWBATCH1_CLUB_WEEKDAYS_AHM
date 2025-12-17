package collectionfrmwrk.settopic;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Ascending order Sorting 
		TreeSet<String>list = new TreeSet<String>();
		
		list.add("royal");//0
		list.add("sagar");//1
		list.add("ramesh");//2
		list.add("kunal");//3
		list.add("rahul");//4
		list.add("rakesh");//5
		list.add("sagar");//6
		list.add("ramesh");//7
		list.add("kunal");//8
		
		Iterator<String> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		
	}

}
