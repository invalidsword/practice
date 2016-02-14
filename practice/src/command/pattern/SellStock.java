package command.pattern;

public class SellStock implements Order
{
	public Stock aStock;
	
	public SellStock(Stock pStock)
	{
		aStock = pStock;
	}

	@Override
	public void execute() 
	{
		aStock.sell();
		
	}

}
