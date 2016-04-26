package visitorGrocery;

public interface Visitor
{
	public void visitCorporation(Corporation c);
	public void visitInventory(Inventory i);
	public void visitItem(Item it);
	
}
