package threadPractice;

public class Driver 
{
	public static void main(String[] args)
	{
		NumberBox b = new NumberBox();
		
		Thread inc = new Thread(new NumberIncrementer(b));
		Thread pri = new Thread(new NumberPrinter(b));
		
		inc.start();
		pri.start();
		
	}
}
