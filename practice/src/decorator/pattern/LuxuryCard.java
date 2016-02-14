package decorator.pattern;

public class LuxuryCard extends CarDecorator
{
	public LuxuryCard(Car pCar)
	{
		super(pCar);
	}
	
	@Override
	public void assemble()
	{
		super.assemble();
		System.out.println("Added luxuries.");
	}
}
