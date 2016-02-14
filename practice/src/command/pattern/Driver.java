package command.pattern;

public class Driver 
{
	public static void main(String[] args)
	{
		Broker tom = new Broker();
		
		Stock appleStock = new Stock("Apple", 20);
		Stock rimStock = new Stock("RIM", 40);
		Stock bellStock = new Stock("Bell", 66);
		
		BuyStock buyApple = new BuyStock(appleStock);
		BuyStock buyRim = new BuyStock(rimStock);
		SellStock sellBell = new SellStock(bellStock);
		
		tom.takeOrder(buyApple);
		tom.takeOrder(buyApple);
		tom.takeOrder(buyRim);
		tom.takeOrder(sellBell);
		
		tom.placeOrder();
	}

}
