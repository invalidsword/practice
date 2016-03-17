package template.pattern;

public class TrafficBasedScheduler extends AbstractScheduler 
{
	private int deliveryDelay = 10;
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
