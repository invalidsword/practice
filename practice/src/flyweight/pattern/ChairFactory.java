package flyweight.pattern;

import java.util.HashMap;

public class ChairFactory 
{
	private static final HashMap<String, furniture> chairMap = new HashMap(); //retrieves a furniture given a string
	
	public static furniture getChair(String type)
	{
		Chair chair = (Chair)chairMap.get(type);
		
		if(chair == null)
		{
			chair = new Chair(type);
			chairMap.put(type, chair);
			System.out.println("Creating a chair of type " + type);
		}
		
		return chair;
		
		
	}

}
