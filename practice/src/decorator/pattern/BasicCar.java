package decorator.pattern;

public class BasicCar implements Car 
{
	@Override
	public void assemble()
	{
		System.out.println("Basic car made.");
	}
}
