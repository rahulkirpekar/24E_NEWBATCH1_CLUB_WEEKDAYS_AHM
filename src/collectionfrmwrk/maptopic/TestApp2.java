package collectionfrmwrk.maptopic;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Maintain Insertion Order
		LinkedHashMap<Integer, String> mapObj = new LinkedHashMap<Integer,String>();
		
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
