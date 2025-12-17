package collectionfrmwrk.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Ascending order Sorting 
		TreeMap<Integer, String> mapObj = new TreeMap<Integer,String>();
		
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
