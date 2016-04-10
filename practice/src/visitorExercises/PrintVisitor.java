package visitorExercises;

import java.util.Iterator;

public class PrintVisitor extends DefaultVisitor
{
	private String aPrefix = " ";
	private Faculty oFaculty; //1: the only faculty to have its departments and committees printed
	
	public PrintVisitor(Faculty pFaculty)
	{
		super();
		oFaculty = pFaculty;
	}
	
	public Faculty getDesiredFaculty()
	{
		return oFaculty;
	}
	
	// no double dispatch
	@Override
	public void visitUniversity(University pUniversity)
	{
		System.out.println(aPrefix + pUniversity.getName());
		aPrefix += " ";
		visitFaculty(oFaculty);
		aPrefix = aPrefix.substring(1);
	}
	
	@Override
	public void visitFaculty(Faculty pFaculty)
	{
		System.out.println(aPrefix + pFaculty.getName());
	
		aPrefix += " ";


		for ( Iterator<Department> i = pFaculty.getDepartments() ; i.hasNext(); )
		{
		  this.visitDepartment(i.next());
		}
		
		for ( Iterator<Committee> i = pFaculty.getCommittees() ; i.hasNext(); )
		{
		  this.visitCommittee(i.next());
		}
			
		aPrefix = aPrefix.substring(1);
	}
	
	@Override
	public void visitDepartment(Department pDepartment)
	{
		System.out.println(aPrefix + pDepartment.getName());
		aPrefix += " ";

		for ( Iterator<Committee> i = pDepartment.getCommittees() ; i.hasNext(); )
		{
		  this.visitCommittee(i.next());
		}
		
		aPrefix = aPrefix.substring(1);
	}
	
	@Override
	public void visitCommittee(Committee pCommittee)
	{
		System.out.println(aPrefix + pCommittee.getName());
		aPrefix += " ";

		for ( Iterator<Committee> i = pCommittee.getCommittees() ; i.hasNext(); )
		{
		  this.visitCommittee(i.next());
		}
		
		aPrefix = aPrefix.substring(1);
	}
		
	// with double dispatch
	/*
	@Override
	public void visitUniversity(University pUniversity)
	{
		System.out.println(aPrefix + pUniversity.getName());
		aPrefix += " ";
		oFaculty.accept(this);
		aPrefix = aPrefix.substring(1);
	}
	
	public void visitFaculty(Faculty pFaculty)
	{
		System.out.println(aPrefix + pFaculty.getName());

		aPrefix += " ";
		super.visitFaculty(pFaculty);
		aPrefix = aPrefix.substring(1);
	}

	@Override
	public void visitDepartment(Department pDepartment)
	{
		System.out.println(aPrefix + pDepartment.getName());
		aPrefix += " ";
		super.visitDepartment(pDepartment);
		aPrefix = aPrefix.substring(1);
	}

	@Override
	public void visitCommittee(Committee pCommittee)
	{
		System.out.println(aPrefix + pCommittee.getName());
		aPrefix += " ";
		super.visitCommittee(pCommittee);
		aPrefix = aPrefix.substring(1);
	}
	*/  
	
	
	
	/* Solution to Part 1
		@Override
	public void visitUniversity(University pUniversity)
	{
		System.out.println(aPrefix + pUniversity.getName());
		aPrefix += " ";
		super.visitUniversity(pUniversity);
		aPrefix = aPrefix.substring(1);
	}
	
	@Override
	public void visitFaculty(Faculty pFaculty)
	{
		System.out.println(aPrefix + pFaculty.getName());

		aPrefix += " ";
		super.visitFaculty(pFaculty);
		aPrefix = aPrefix.substring(1);
	}

	@Override
	public void visitDepartment(Department pDepartment)
	{
		System.out.println(aPrefix + pDepartment.getName());
		aPrefix += " ";
		super.visitDepartment(pDepartment);
		aPrefix = aPrefix.substring(1);
	}

	@Override
	public void visitCommittee(Committee pCommittee)
	{
		System.out.println(aPrefix + pCommittee.getName());
		aPrefix += " ";
		super.visitCommittee(pCommittee);
		aPrefix = aPrefix.substring(1);
	}
	*/
	
	
	
	
	/*@Override //Part 2 (traversal in accept)
	public void visitUniversity(University pUniversity)
	{
		System.out.println(aPrefix + pUniversity.getName());
		aPrefix += " ";
		aPrefix = aPrefix.substring(1);
	}
	
	@Override
	public void visitFaculty(Faculty pFaculty)
	{
		System.out.println(aPrefix + pFaculty.getName());

		aPrefix += " ";
		aPrefix = aPrefix.substring(1);
	}

	@Override
	public void visitDepartment(Department pDepartment)
	{
		System.out.println(aPrefix + pDepartment.getName());
		
		aPrefix += " ";
		aPrefix = aPrefix.substring(1);
	}

	@Override
	public void visitCommittee(Committee pCommittee)
	{
		System.out.println(aPrefix + pCommittee.getName());
		
		aPrefix += " ";
		aPrefix = aPrefix.substring(1);
	}
	*/
	
	
	
	
	//original method 
	/*@Override
	public void visitUniversity(University pUniversity)
	{
		System.out.println(aPrefix + pUniversity.getName());
		aPrefix += " ";
		super.visitUniversity(pUniversity);
		aPrefix = aPrefix.substring(1);
	}*/
	
	/* Solution to Part 1
	@Override
	public void visitFaculty(Faculty pFaculty)
	{
		System.out.println(aPrefix + pFaculty.getName());

		aPrefix += " ";
		super.visitFaculty(pFaculty);
		aPrefix = aPrefix.substring(1);
	}

	@Override
	public void visitDepartment(Department pDepartment)
	{
		System.out.println(aPrefix + pDepartment.getName());
		aPrefix += " ";
		super.visitDepartment(pDepartment);
		aPrefix = aPrefix.substring(1);
	}

	@Override
	public void visitCommittee(Committee pCommittee)
	{
		System.out.println(aPrefix + pCommittee.getName());
		aPrefix += " ";
		super.visitCommittee(pCommittee);
		aPrefix = aPrefix.substring(1);
	}
	*/
	
}
