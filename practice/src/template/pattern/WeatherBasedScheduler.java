package template.pattern;

public class WeatherBasedScheduler extends AbstractScheduler
{
	private int deliveryDelay = 10;
	
	public WeatherBasedScheduler(String pName) 
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
