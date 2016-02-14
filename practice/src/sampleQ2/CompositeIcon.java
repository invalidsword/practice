package sampleQ2;

import java.util.ArrayList;
import java.util.List;

public class CompositeIcon implements Icon 
{
	List<Icon> aIcons = new ArrayList<Icon>(); 

	public void add(Icon pIcon)
	{
		aIcons.add(pIcon);
	}
	
	public void remove(Icon pIcon)
	{
		aIcons.remove(pIcon);
	}
	
	@Override
	public int getIconWidth() 
	{
		int totalWidth = 0;
		
		for(Icon i : aIcons)
		{
			totalWidth += i.getIconWidth();
		}
		return totalWidth;
	}

	@Override
	public int getIconHeight() 
	{
		int totalHeight = 0;
		
		for(Icon i : aIcons)
		{
			totalHeight += i.getIconHeight();
		}
		return totalHeight;
	}

	@Override
	public void paintIcon(int x, int y) 
	{
		Icon shifted = new ShiftedIcon(aIcons.get(0),1);
		
		shifted.paintIcon(x, y);
	}

}
