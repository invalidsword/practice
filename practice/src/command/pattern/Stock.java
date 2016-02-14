package command.pattern;

public class Stock 
{
	public String aName;
	public int aQuantity;
	
	public Stock(String pName, int pQuantity)
	{
		aName = pName;
		aQuantity = pQuantity;
	}
	
	public void buy()
	{
		System.out.println("Stock [ Name: "+aName+", Quantity: " + aQuantity +" ] bought");
	}
	
	public void sell()
	{
		 System.out.println("Stock [ Name: "+aName+", Quantity: " + aQuantity +" ] sold");
	}
	
}
