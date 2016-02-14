package sampleQ2;

public class Drive 
{
	public static void main(String[] args)
	{
		CompositeIcon webpage = new CompositeIcon();
		Icon aossum = new ImageIcon(0,0, "AOSSUM");
		Icon mumsa = new ImageIcon(0,0, "MUMSA");
		
		webpage.add(aossum);
		webpage.add(mumsa);
		
		webpage.paintIcon(2, 2);
	}
}
