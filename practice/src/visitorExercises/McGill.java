package visitorExercises;

public class McGill
{
	public static void main(String[] args)
	{
		University lMcGill = new University("McGill");
		Faculty lScience = new Faculty("Science");
		Faculty lArts = new Faculty("Arts");
		Department lSOCS = new Department("Computer Science");
		Department lPhysics = new Department("Physics");
		Committee lAca = new Committee("Academic");
		Committee lSco = new Committee("Scholarship");
		Committee lMsc = new Committee("MSc");
		Committee lWeb = new Committee("Web");
		Department lEconomics = new Department("Economics");
		Committee lStudents = new Committee("Students");
		
		lMcGill.addFaculty(lScience);
		lMcGill.addFaculty(lArts);
		lScience.addDepartment(lSOCS);
		lScience.addDepartment(lPhysics);
		lArts.addDepartment(lEconomics);
		
		lScience.addCommittee(lAca);
		lScience.addCommittee(lSco);
		lArts.addCommittee(lStudents);
		
		lSOCS.addCommittee(lMsc);
		lMsc.addCommittee(lWeb);
		
		lMcGill.accept(new PrintVisitor(lScience));
	}
}
