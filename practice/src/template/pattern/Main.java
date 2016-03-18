package template.pattern;

import java.util.LinkedList;
import java.util.Queue;

public class Main 
{
	public static void main(String[] args)
	{
	    /* Queue<Integer> q = new LinkedList<Integer>();
	    
	   
	    q.add(1);
	    q.add(2);
	    q.add(3);
	    q.add(4);
	    
	    System.out.println(q.remove());
	    System.out.println(q.remove());
	    System.out.println(q.remove());
	    System.out.println(q.remove());
		*/
		
		
		//instantiate observers
		Amazon prime = new Amazon("Prime");
		Amazon student = new Amazon("Student");
		
		//instantiate some bikers
		Biker lou = new Biker("Lou", 1);
		Biker alexandra = new Biker("Alexandra", 2);
		Biker james = new Biker("James", 3);
		
		//instantiate some locations
		Location burnside = new Location("Burnside");
		Location leacock = new Location("Leacock");
		Location trottier = new Location("Trottier");
		
		//instantiate schedulers
		AbstractScheduler traf = new TrafficBasedScheduler("Traffic Scheduler");
		AbstractScheduler weath = new WeatherBasedScheduler("Weather Scheduler");
		
		
		traf.addBiker(lou);
		traf.addBiker(alexandra);
		
		
		traf.addObserver(prime);
		traf.addObserver(student);
		
		traf.schedule(burnside);
		weath.schedule(leacock);
		
	}
}
