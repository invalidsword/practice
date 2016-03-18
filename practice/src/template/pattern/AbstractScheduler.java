package template.pattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class AbstractScheduler implements Scheduler 
{
	private static Queue<Biker> aBikers = new LinkedList<Biker>();
	private static List<SchedulerObserver> aObservers = new ArrayList<SchedulerObserver>();
	private Biker recipient;
	private String aName;
	private Location newestLocation;
	
	public AbstractScheduler(String pName)
	{
		aName = pName;
	}
	
	public final void schedule(Location pLocation)
	{
		newestLocation = pLocation;
		
		if(checkAvailability())
		{
			notifyObservers();
		}
		else
		{
			System.out.println("No bikers available yet to deliver.");
		}

	}
	
	private boolean checkAvailability()
	{
		if(aBikers.size() >= 1)
		{
			recipient = aBikers.remove();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void addBiker(Biker pBiker) 
	{
		aBikers.add(pBiker);
	}
	
	public void addObserver(SchedulerObserver pScheduleObserver)
	{
		aObservers.add(pScheduleObserver);
	}
	
	private void notifyObservers()
	{
		for(SchedulerObserver s : aObservers)
		{
			s.notifyNewDelivery(recipient,  newestLocation, getTime());
		}
	}
	
	protected abstract void basicSchedule(Location pLocation);
	protected abstract int getTime();
}
