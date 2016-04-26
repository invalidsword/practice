package weatherObserver;

import java.util.ArrayList;
import java.util.List;

public class Observable 
{
	
	private List<Observer> aObs = new ArrayList<>();
	
	public void addObs(Observer o)
	{
		aObs.add(o);
	}
	
	public void subObs(Observer o)
	{
		aObs.add(o);
	}
	
	public final void notifyAllObs(BasicModel pBasic)
	{
		for( Observer o : aObs)
		{
			o.updatedModel(pBasic);
		}
	}
	
}
