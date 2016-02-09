package singleton.pattern;

public class Driver{

	public static void main(String args[])
	{
		ClubVisitor Sally = new ClubVisitor(17);
		
		ClubBouncer Steve = ClubBouncer.getInstance(); //steve is the only guy working tonight
		ClubBouncer SteveInDrag = ClubBouncer.getInstance();
		
		if(Steve.allowsEntry(Sally))
			System.out.println("allowed in!");
		else
			System.out.println("not allowed in!");
			
		int dsa = ClubBouncer.legalAgeLimit;
		
	}
	
}