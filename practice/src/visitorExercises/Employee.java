package visitorExercises;

import java.util.ArrayList;
import java.util.List;

/**
 * This example demonstrates the complexities
 * of using the Visitor design pattern on a 
 * class hierarchy that makes heavy use of inheritance,
 * especially if the visit methods are overloaded.
 * 
 * What happens when alice accepts the visitor? Not
 * super obvious.
 *
 */
public class Employee
{
	public void accept(EmployeeVisitor pVisitor)
	{
		pVisitor.visit(this);
	}
	
	public static void main(String[] args)
	{
		Manager alice = new Manager();
		alice.accept(new CompanyVisitor());
		
		Employee goAskAlice = new Manager();
		goAskAlice.accept(new CompanyVisitor());
		
		Employee pewter = new Employee();
		pewter.accept(new CompanyVisitor());
	}
}

class Manager extends Employee
{
	private List<Employee> aEmployees = new ArrayList<Employee>();
	
	@Override
	public void accept(EmployeeVisitor pVisitor)
	{
		pVisitor.visit(this);
	}
}

interface EmployeeVisitor
{
	public void visit(Employee pEmployee);
	public void visit(Manager pManager);
}

class CompanyVisitor implements EmployeeVisitor
{
	@Override
	public void visit(Manager pManager)
	{
		System.out.println("Visited manager");
	}

	@Override
	public void visit(Employee pEmployee)
	{
		System.out.println("Visited employee");
		
	}


}