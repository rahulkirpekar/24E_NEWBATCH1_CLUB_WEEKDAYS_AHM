package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(true);//0
		list.add(12);//1
		list.add(5432L);//2
		list.add(123.34);//3
		list.add(543.5432f);//4
		list.add('R');//5
		list.add("Royal");//6
	
		Student s = new Student(1, "Rahul", 12);
		list.add(s);//7

		System.out.println("list.size() : " + list.size());
/*		
		// 1. Simple for loop
		for (int i = 0; i < list.size(); i++) 
		{
			Object obj = list.get(i);
			if (obj instanceof Student) 
			{
				Student s1= (Student)obj;
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println("list.get("+ i +") : " + obj);
			}
		// 2. for each / Advanced for loop
			for(Object obj : list) 
			{
				if (obj instanceof Student) 
				{
					Student s1= (Student)obj;
					System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
				} else 
				{
					System.out.println(obj);
				}
			}
			
		// 3. traditional way
		Iterator itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Object obj= (Object) itr.next();
			if (obj instanceof Student) 
			{
				Student s1= (Student)obj;
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println(obj);
			}			
		}
 */
	}
}
