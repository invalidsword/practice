package threadPractice;

public class NumberPrinter implements Runnable 
{
	private NumberBox box;
	
	public NumberPrinter(NumberBox pBox)
	{
		box = pBox;
	}

	@Override
	public void run() 
	{
		while(true)
		{
				box.whatsInTheBox();
			
			try 
			{
				Thread.sleep(1000);	
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}	
		}
	}

}
