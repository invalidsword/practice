package template.pattern;

public interface Scheduler 
{
	public void addBiker(Biker aBiker);
	public void schedule(Location aLocation); /*throws SchedulingException*/
	public void addObserver(SchedulerObserver aScheduleObserver);
}
