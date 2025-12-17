package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("royal");//0
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
		
		System.out.println("-------------------------------");
//		list.remove(2);//remove
//		list.set(2, "Rakesh Patel");// update

		itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
