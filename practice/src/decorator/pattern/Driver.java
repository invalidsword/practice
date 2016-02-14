package decorator.pattern;

public class Driver {

	public static void main(String[] args) 
	{
		Car skyline = new SportsCar(new BasicCar());
		skyline.assemble();

	}

}
