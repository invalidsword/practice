package visitorGrocery;

import java.util.Iterator;

public class PrintVisitor implements Visitor
{
	private Inventory inv;
	@Override
	public void visitCorporation(Corporation c)
	{
		System.out.println(c.getName());
		
		Iterator<Inventory> inven = c.iterator();
		
		while(inven.hasNext())
		{
			Inventory i = inven.next();
			i.accept(this);
		}
		
	}

	@Override
	public void visitInventory(Inventory i)
	{
		
		System.out.println(i.getName());
		inv = i;
		
		Iterator<Item> items = i.iterator();
		
		while(items.hasNext())
		{
			Item h = items.next();
			h.accept(this);
		}
	}

	@Override
	public void visitItem(Item it)
	{
		System.out.println(it.getName() + ": " + inv.available(it));
		
	}

}
