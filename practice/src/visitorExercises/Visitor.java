package visitorExercises;

public interface Visitor
{
	void visitUniversity(University pUniversity);
	void visitFaculty(Faculty pFaculty);
	void visitDepartment(Department pDepartment);
	void visitCommittee(Committee pCommittee);
	public Faculty getDesiredFaculty();
}
