package template.pattern;

public class TrafficBasedScheduler extends AbstractScheduler 
{
	private int deliveryDelay = 20;
	
	public TrafficBasedScheduler(String pName) 
	{
		super(pName);

	}

	protected void basicSchedule(Location pLocation)
	{
		
	}
	
	protected int getTime()
	{
		return deliveryDelay;
	}

}
