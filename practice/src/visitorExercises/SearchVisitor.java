package visitorExercises;

/**
 * A Visitor that traverses the object graph and obtains
 * the committee-depth level for a specified committee. Top-level
 * committees are level 0, subcommittees are level 1, etc.
 * For example, searching for the Web subcommittee of the M.Sc. 
 * committee should produce value 1.
 */
public class SearchVisitor extends DefaultVisitor
{
	private String aQuery;
	private int aDepth = 0;
	private int aResult = -1;
	
	public SearchVisitor(String pQuery) { aQuery = pQuery; }
	
	public int getResult() { return aResult; }
	
	public void visitCommittee(Committee pCommittee)
	{
		if( pCommittee.getName().equals(aQuery))
		{
			aResult = aDepth;
			return;
		}
		aDepth++;
		super.visitCommittee(pCommittee);
		aDepth--;
	}

}
