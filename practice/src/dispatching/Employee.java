package dispatching;

public class Employee 
{
	private String aName;
	private int aSalary;
	
	public String getName()
	{
		return aName;
	}
	
	public int getSalary()
	{
		return aSalary;
	}
	
	public Employee()
	{
		System.out.println("Employee default constructor.");
	}
	
	public Employee(String pName, int pSalary)
	{
		aName=pName; 
		aSalary = pSalary;
	}
}
