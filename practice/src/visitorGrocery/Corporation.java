package visitorGrocery;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation implements Iterable<Inventory>, Node
{
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	private final String aName;
	
	public Corporation(String pName)
	{
		aName = pName;
	}
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}

	@Override
	public Iterator<Inventory> iterator()
	{
		return aInventories.values().iterator();
	}
	
	public String getName()
	{
		return aName;
	}


	@Override
	public void accept(Visitor v)
	{
		v.visitCorporation(this);
//		Set<String> keys = aInventories.keySet();
//		
//		for(String k : keys)
//		{
//			Inventory i = aInventories.get(k);
//			i.accept(v);
//		}
	
	}

}
