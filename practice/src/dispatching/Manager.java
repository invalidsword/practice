package dispatching;

public class Manager extends Employee
{
	private int aBonus;
	
	public Manager()
	{
		System.out.println("Manager default constructor");
	}
	
	public Manager(String pName, int pSalary, int pBonus)
	{
		super(pName, pSalary);
		aBonus = pBonus;
	}
	
	public int getSalary()
	{
		return super.getSalary() + 1;
	}
}
