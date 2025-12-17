package collectionfrmwrk.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Sorting---Ascending order
		PriorityQueue<String> queueObj = new PriorityQueue<>();
				
		queueObj.add("royal");//0
		queueObj.add("sagar");//3
		queueObj.add("ramesh");//4
		queueObj.add("kunal");//5
		queueObj.add("rahul");//1
		queueObj.add("rakesh");//2
		queueObj.add("sagar");//3
		queueObj.add("ramesh");//4
		queueObj.add("kunal");//5
		
		while(!queueObj.isEmpty()) 
		{
			String value = queueObj.poll();
			System.out.println(value);
		}
	}
}
