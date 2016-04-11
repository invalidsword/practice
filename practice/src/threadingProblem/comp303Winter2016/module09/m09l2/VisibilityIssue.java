package threadingProblem.comp303Winter2016.module09.m09l2;

/**
 * This program illustrates how one can be lured into a false
 * senses of security, or wrongly assume that it's generally
 * feasible to "reason through" the synchronization of a 
 * multi-threaded program that does not use synchronization
 * primitives. This program is not thread safe because 
 * changes to the stop field made in the main thread may 
 * not be visible to the other thread. So, although on my
 * machine the thread does stop, it is not generally guaranteed
 * to do so. To solve the problem, make the field volatile or make
 * enoughSaid() synchronized.
 */
public class VisibilityIssue extends Thread
{
	private volatile /*new*/boolean stop = false;
	
	public void run() { while( !stop) System.out.println("Try to stop me!"); }
	
	public synchronized /*new*/void enoughSaid() { stop = true; }
	
	public static void main(String[] args)
	{
		VisibilityIssue vi = new VisibilityIssue();
		vi.start();
		try{Thread.sleep(1000);}catch(InterruptedException e){}
		vi.enoughSaid();
	}
}
//2 Threads : main and vi