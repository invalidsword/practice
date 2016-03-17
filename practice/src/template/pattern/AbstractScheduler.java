package template.pattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class AbstractScheduler implements Scheduler 
{
	private Queue<Biker> aBikers = new LinkedList<Biker>();
	private List<SchedulerObserver> aObservers = new ArrayList<SchedulerObserver>();
	private boolean bikerAvailability;
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
		
		//call checkAvailability
		//call basicSchedule
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
	
	public void addBiker(Biker aBiker) 
	{
		aBikers.add(aBiker);
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
	
}
