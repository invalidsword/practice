package singleton.pattern;

//singleton club bouncer
public class ClubBouncer{

	private static ClubBouncer theOnlyBouncer = null;
	public static int legalAgeLimit = 18;
	private int lastEntryAge; //age of the last person who was let in
	
	private ClubBouncer(){}
	
	//yes you're allowed in or no you're not
	public boolean allowsEntry(ClubVisitor visitor)
	{
		if(visitor.age >= 18){
			lastEntryAge = visitor.age;
			return true;
		}
		return false; //you're too young
	}
	
	public static ClubBouncer getInstance(){
		//lazy loading
		//only instantiate when this method is first called
		
		if(theOnlyBouncer == null)
			theOnlyBouncer = new ClubBouncer();
			
		return theOnlyBouncer;
	}
	
	public int getLastEntryAge(){
		return lastEntryAge;
	}
	
}

