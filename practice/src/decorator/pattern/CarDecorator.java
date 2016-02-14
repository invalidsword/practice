package decorator.pattern;

public class CarDecorator implements Car 
{
	protected Car aCar;
	
	public CarDecorator(Car pCar)
	{
		aCar = pCar;
	}
	
	@Override
	public void assemble()
	{
		this.aCar.assemble();
	}
	
}
