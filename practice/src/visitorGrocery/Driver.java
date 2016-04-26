package visitorGrocery;

import java.util.Random;

/**
 * Utility class with a driver program and some 
 * sample items and inventories.
 */
public final class Driver
{
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	
	private Driver() {}

	public static void main(String[] pArgs)
	{
		Random random = new Random();
		Inventory inventory1 = new Inventory("IGA Location 1");
		Inventory inventory2 = new Inventory("IGA Location 2");
		Inventory inventory3 = new Inventory("IGA Location 3");
		for( Item item : ITEMS )
		{
			inventory1.stock(item, random.nextInt(50));
			inventory2.stock(item, random.nextInt(50));
			inventory3.stock(item, random.nextInt(50));
		}
		Corporation iga = new Corporation("IGA");
		iga.addInventory(inventory1);
		iga.addInventory(inventory2);
		iga.addInventory(inventory3);
		
		iga.accept(new PrintVisitor());
	}
}
