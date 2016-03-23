package dispatching;

public class Programmer extends Employee
{
	
	public Programmer()
	{
		System.out.println("Programmer default constructor");
	}
	
	public Programmer(String pName, int pSalary)
	{
		super(pName, pSalary);
	}
	
	public int getSalary()
	{
		return super.getSalary() + 2;
	}
}
