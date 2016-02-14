package composite.pattern;

public class File implements AbstractFile
{
	private String aName;
	public int aValue;
	
	public File(String pName, int pValue)
	{
		aName = pName;
		aValue = pValue;
	}
	
	public void ls()
	{
		System.out.println("This is file: " + aName);;
	}
	
	public String getName()
	{
		return aName;
	}
	
}
