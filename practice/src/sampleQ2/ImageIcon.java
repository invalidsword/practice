package sampleQ2;

public class ImageIcon implements Icon 
{
	private int aWidth;
	private int aHeight;
	private String aName;
	
	public ImageIcon(int pWidth, int pHeight, String pName)
	{
		this.aHeight = pHeight;
		this.aWidth = pWidth;
		this.aName = pName;
	}

	@Override
	public int getIconWidth() 
	{
		return aWidth;
	}

	@Override
	public int getIconHeight() 
	{
		
		return aHeight;
	}

	@Override
	public void paintIcon(int x, int y) 
	{
		
		System.out.println(aName + " drawn at " + x + ", " + y);
	}

}
