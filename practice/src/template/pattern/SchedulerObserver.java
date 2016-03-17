package template.pattern;

public interface SchedulerObserver 
{
	public void notifyNewDelivery(Biker aBiker, Location aLocation, int aDeliveryTime);

}
