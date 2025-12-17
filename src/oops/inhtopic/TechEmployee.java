package oops.inhtopic;

// MultiLevel Inheritance
public class TechEmployee extends Employee
{
	String projectName;
	
	public TechEmployee() 
	{
	}
	
	public TechEmployee(int id,String name,String dsgn,String projectName) 
	{
		this.id=id;
		this.name=name;
		this.dsgn=dsgn;
		this.projectName=projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void dispData() 
	{
		System.out.println(id+" " + name+" " + dsgn+" " + projectName);
	}
}
