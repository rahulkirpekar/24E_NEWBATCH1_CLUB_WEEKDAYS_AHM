package stringtopic.immutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		//				0   1   2    3     4   5       6   7      8
		String stmt = "This is Java which is developed by James Gosling.";
	
		String words[] = stmt.split("\\s");
		
		System.out.println("words.length : " + words.length);
		
		for (int i = 0; i < words.length; i++) 
		{
			System.out.println("words["+ i +"] : " + words[i]+"---"+words[i].length());
		}
	}
}
