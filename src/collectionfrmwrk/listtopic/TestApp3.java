package collectionfrmwrk.listtopic;

import java.util.Iterator;
import java.util.Vector;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(10);
		list.add(7);
		list.add(4);
		list.add(78);
		list.add(10);
		list.add(7);
		list.add(4);
		list.add(78);
		list.add(23);
		list.add(90);
		
		Iterator<Integer> itr =	list.iterator();
		while (itr.hasNext()) 
		{
			Integer value = (Integer) itr.next();
			System.out.println(value);
		}
	}
}
