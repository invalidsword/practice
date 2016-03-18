package template.pattern;

public class Amazon implements SchedulerObserver 
{
	private String aName;
	
	public Amazon(String pName)
	{
		aName = pName;
	}
	public void notifyNewDelivery(Biker pBiker, Location pLocation, int pDeliveryTime)
	{
		System.out.println("New Delivery for " + pBiker.getName() + " at address " + pLocation.getAddress() + " in " + pDeliveryTime);
	}
}
