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
		//Q: if(is?) printing and adding (those operations) are atomic, then is there an absolute need to synchro?
		//yes: pri could print number before inc SAVed register that contained the newly incremented number - operations not atomic
	}
}
