package collectionfrmwrk.maptopic;

import java.util.HashMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Not Maintain Insertion Order
		HashMap<Integer, String> mapObj = new HashMap<Integer,String>();
		
		mapObj.put(98, "Rahul");// Entry--->[Key,value]---put
		mapObj.put(2, "Krunal");
		mapObj.put(45, "Rakesh");
		mapObj.put(23, "Dev");
		mapObj.put(87, "Sejal");
		
		
		for(Map.Entry<Integer, String> e : mapObj.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}
