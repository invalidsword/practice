package command.pattern;

public class BuyStock implements Order
{
	public Stock aStock;
	
	public BuyStock(Stock pStock)
	{
		aStock = pStock;
	}

	@Override
	public void execute() 
	{
		aStock.buy();
		
	}

}
