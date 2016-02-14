package decorator.pattern;

public class SportsCar extends CarDecorator 
{
	private int aTopSpeed;
	
	
	public SportsCar(Car pCar)
	{
		super(pCar);
	}
	
	@Override
	public void assemble()
	{
		aCar.assemble();
		System.out.println("Added sports car features.");
	}
}
