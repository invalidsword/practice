package multithreading.comp303Winter2016.module09.module09;

/**
 * Demonstrates how to interrupt the thread.
 * While blocking operations will raise an exception
 * if the interrupted flag is set to true, in other cases
 * the status needs to be checked with the interrupted() method.
 * Note, however, that this method resets the flag to false.
 */
public class BasicSleeper
{
	public static void main( String[] args ) throws Exception
	{
		Thread t = new Thread( new TheSleeper() );
		t.start();
		Thread.sleep(5000);
		t.interrupt();
	}
}

class TheSleeper implements Runnable
{

	public void run()
	{
		try
		{
			if( Thread.interrupted() )
			{
				System.out.println("Interrupted 1");
				return;
			}
			// The code below will demonstrate how when this code
			// runs, the thread's interrupted flag is set. Nothing 
			// will happen until sleep, which will raise an exception.
			// However, interrupted() resets the interrupt flag, so 
			// to observe the original behavior, you must comment
			// out the line below.
			//System.out.println(Thread.interrupted());
			Thread.sleep(10000);
			System.out.println("Done");
		} 
		catch (InterruptedException e)
		{
			System.out.println("Interrupted 2");
			return;
		}
	}
}
