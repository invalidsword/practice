package flyweight.pattern;
//initial commit
public class Chair implements furniture 
{
	
	private String colour;
	private String type;
	private int size;
	
	public Chair(String pType)
	{
		type = pType;
	}
	
	public void setColour(String pColour)
	{
		colour = pColour;
	}
	
	public void setSize(int pSize)
	{
		size = pSize;
	}

	public String getInfo()
	{
		return colour + " and size " + size + " and type " + type; 
	}
}
