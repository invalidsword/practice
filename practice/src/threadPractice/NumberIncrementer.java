package threadPractice;

public class NumberIncrementer implements Runnable 
{

	private NumberBox box;
	
	public NumberIncrementer(NumberBox pBox)
	{
		box = pBox;
	}
	
	@Override
	public void run() 
	{
		while(true)
		{
			box.add(1);
			
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
