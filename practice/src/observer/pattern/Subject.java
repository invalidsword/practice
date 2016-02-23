package observer.pattern;

import java.util.ArrayList;
import java.util.List;



public class Subject 
{
	private List<Observer> pObservers = new ArrayList<Observer>();
	private int aState;
	
	public int getState()
	{
		return aState;
	}
	
	public void setState(int pState)
	{
		aState = pState;
	}
	
	public void attach(Observer pObserver)
	{
		pObservers.add(pObserver);
	}
	
	public void notifyAllObservers()
	{
		for(Observer o : pObservers)
		{
			o.update();
		}
	}
	
	
}
