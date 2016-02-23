package observer.pattern;

public class BinaryObserver implements Observer 
{
	private Subject aSubject;
	public BinaryObserver(Subject pSubject)
	{
		aSubject = pSubject;
		aSubject.attach(this);
	}
	
	@Override
	public void update()
	{
		 System.out.println( "Binary String: " + Integer.toBinaryString(aSubject.getState() ) );
	}

}
