package strategy.pattern;
//first change
public class taxByPercentage implements taxMethod 
{

	@Override
	public int taxAmount(int amount)
	{
		return (int) (amount*0.15);
	}
	
}
