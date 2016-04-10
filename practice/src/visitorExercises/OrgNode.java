package visitorExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class OrgNode implements IVisitable
{
	private String aName = "<default>";
	
	public String getName() { return aName; }
	public OrgNode( String pName ) { aName = pName; }
	public String toString() { return getName(); }
}

class University extends OrgNode
{	
	private final List<Faculty> aFaculties = new ArrayList<Faculty>();
	
	public University(String pName) { super(pName); }
	public void addFaculty(Faculty pFaculty) { aFaculties.add(pFaculty); }
	public Iterator<Faculty> getFaculties() { return aFaculties.iterator(); }
	
	//	Original
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitUniversity(this);
	}
	/*
	// object traversal in accept
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitUniversity(this);
		
		Faculty oFaculty = pVisitor.getDesiredFaculty();
		
		oFaculty.accept(pVisitor);
	}*/
}

class Faculty extends OrgNode
{
	private final List<Department> aDepts = new ArrayList<Department>();
	private final List<Committee> aCommittees = new ArrayList<Committee>();
	
	public Faculty(String pName) { super(pName); }
	public void addDepartment(Department pDepartment) { aDepts.add(pDepartment); }
	public void addCommittee(Committee pCommittee) { aCommittees.add(pCommittee); }
	public Iterator<Department> getDepartments() { return aDepts.iterator(); }
	public Iterator<Committee> getCommittees() { return aCommittees.iterator(); }
	//  object traversal in accept
/* original	public void accept(Visitor pVisitor)
	{
		pVisitor.visitFaculty(this);
		
		for( Department d : aDepts )
		{
			d.accept(pVisitor);
		}
		
		for( Committee c : aCommittees )
		{
			c.accept(pVisitor);
		}
	}*/
	
	//original
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitFaculty(this);
	}
	
}

class Department extends OrgNode
{
	private final List<Committee> aCommittees = new ArrayList<Committee>();
	
	public Department(String pName) { super(pName); }
	public void addCommittee(Committee pCommittee) { aCommittees.add(pCommittee); }
	public Iterator<Committee> getCommittees() { return aCommittees.iterator(); }
	
    //  object traversal in accept
	/*
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitDepartment(this);
		
		for( Committee c : aCommittees)
		{
			c.accept(pVisitor);
		}
	}*/
	
	// original
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitDepartment(this);
	}

}

class Committee extends OrgNode
{
	private final List<Committee> aCommittees = new ArrayList<Committee>();
	
	public Committee(String pName) { super(pName); }
	public void addCommittee(Committee pCommittee) { aCommittees.add(pCommittee); }
	public Iterator<Committee> getCommittees() { return aCommittees.iterator(); }
    
	//  object traversal in accept
	/*
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitCommittee(this);
		
		for( Committee c : aCommittees)
		{
			c.accept(pVisitor);
		}
	}
	*/
	
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitCommittee(this);
	}
}