package command.pattern;

import java.util.ArrayList;
import java.util.List;

public class Broker 
{
	List<Order> aOrders = new ArrayList<Order>();
	
	void takeOrder(Order pOrder)
	{
		aOrders.add(pOrder);
	}
	
	void placeOrder()
	{
		for(Order order : aOrders)
		{
			order.execute();
		}
	}
}
