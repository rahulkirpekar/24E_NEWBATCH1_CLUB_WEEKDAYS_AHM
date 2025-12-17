package exceptiontopic;

import java.io.FileOutputStream;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		// try with Autoclosable resource
		try 
			(
					// 1. file-- open connection
					FileOutputStream fout = new FileOutputStream("text");
			)
		{
			// 2. process(read/write)

			
			
			// 3. file connection close---JVM
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
