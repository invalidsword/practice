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
		box.whatsInTheBox();
		
		try 
		{
			Thread.sleep(100);	
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}

}
