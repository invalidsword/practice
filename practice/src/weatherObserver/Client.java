package weatherObserver;

import java.util.ArrayList;
import java.util.List;

public class Client 
{
	public final int a;
	public final List<Integer> list;
	
	public static void main(String[] args)
	{
		
	}
	
	public Client(int d)
	{
		a = d;
		list = new ArrayList<>();

	}
	
	public int returnInt()
	{
		int b = 2;
		list.add(22);
		return a;
	}
}
