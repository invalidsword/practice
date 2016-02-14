package sampleQ2;

public class IconDecorator implements Icon
{
	private Icon aIcon;
	protected int shiftAmount;
	
	public IconDecorator(Icon pIcon, int pShiftAmount)
	{
		aIcon = pIcon;
		shiftAmount = pShiftAmount;
	}

	@Override
	public int getIconWidth() 
	{
		return aIcon.getIconWidth();
	}

	@Override
	public int getIconHeight() 
	{
		return aIcon.getIconHeight();
	}

	@Override
	public void paintIcon(int x, int y) 
	{
		aIcon.paintIcon(x, y);
	}

}
