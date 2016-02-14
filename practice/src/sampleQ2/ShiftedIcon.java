package sampleQ2;

public class ShiftedIcon extends IconDecorator
{
	
	public ShiftedIcon(Icon pIcon, int pShiftAmount)
	{
		super(pIcon, pShiftAmount);
	}
	
	public int getIconWidth()
	{
		return super.getIconWidth();
	}
	
	public int getIconHeight()
	{
		return super.getIconHeight();
	}
	
	public void paintIcon(int x, int y) 
	{
		super.paintIcon(x + shiftAmount , y + shiftAmount);
	}
}
