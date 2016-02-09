package comparable;

public class Driver {

	public static void main(String[] args) 
	{
		Planet Mars = new Planet(1000000, 9025, "CO2");
		Planet Venus = new Planet(2000000, 12000, "Methane");
		
		
		if(Mars.compareTo(Venus) < 0)
		{
			System.out.println("Mars is bigga.");
		}
		else if(Mars.compareTo(Venus) > 0)
		{
			System.out.println("Nah Venus is bigga.");			
		}
		else
		{
			System.out.println("They're equal.");
		}

	}

}
