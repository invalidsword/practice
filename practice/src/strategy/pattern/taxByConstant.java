package strategy.pattern;

public class taxByConstant implements taxMethod
{

	@Override
	public int taxAmount(int amount) 
	{

		return 5000;
	}
	
}
