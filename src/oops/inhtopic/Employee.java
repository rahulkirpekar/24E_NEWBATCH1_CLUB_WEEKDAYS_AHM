package oops.inhtopic;

// Hierarchycal Inheritance
public class Employee extends Person
{
	protected int id;
	protected String dsgn;
	
	public Employee() 
	{
	}
	Employee(int id,String name,String dsgn)
	{
		this.id=id;
		this.name=name;
		this.dsgn = dsgn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDsgn() {
		return dsgn;
	}
	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
	
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + dsgn);
	}
}
