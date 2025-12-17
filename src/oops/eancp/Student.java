package oops.eancp;

// Pure Encapsulation = 1. private(Dms) 2. Mfspublic()
public class Student 
{
	private int rno;
	private String name;
	private int std;

	// 1. constructor
	
	// 2. method
	// setters(Mutators) and getters(Accessors)
	
	public void setRno(int rno) 
	{
		this.rno = rno;
	}
	public int getRno() 
	{
		return rno;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}

	public void setStd(int std) 
	{
		this.std = std;
	}
	public int getStd() 
	{
		return std;
	}
}
