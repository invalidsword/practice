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
		}
		
	}

}
