package objectClass;
import comparable.Planet;

public class Driver 
{

	public static void main(String[] args) 
	{
		Planet Mars = new Planet(100, 5,"Nitrogen");
		Planet MarsTwo = new Planet(100, 22, "Methane");
		
		System.out.println(Mars.equals(MarsTwo));
	}

}
