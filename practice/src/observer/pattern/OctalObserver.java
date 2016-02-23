package observer.pattern;

public class OctalObserver implements Observer 
{
	private Subject aSubject;
	
	public OctalObserver(Subject pSubject)
	{
		aSubject = pSubject;
		aSubject.attach(this);
	}
	
	public void update()
	{
		System.out.println( "Octal String: " + Integer.toOctalString( aSubject.getState() ) ); 
	}
}
