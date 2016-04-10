package multithreading.comp303Winter2016.module09.module09;

/**
 * Basic demonstration of threat creation in Java.
 * 
 * Exercise: re-organize the code so you define the behavior
 * of the run method in only one place, and use a parameter
 * for the string to print out.
 *
 */
public class IndecisivePerson
{
	public static void main(String[] args)
	{
/*		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				while(true)
				{
					System.out.println("Maybe not!");
					try
					{
						Thread.sleep(500);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();*/
		
		Thread maybe = new MyThread();
		maybe.start();
		
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				while(true)
				{
					System.out.println("Maybe!");
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}

class MyThread extends Thread
{
	@Override
	public void run()
	{
		while(true)
		{
			System.out.println("Maybe not");
		}
	}
}