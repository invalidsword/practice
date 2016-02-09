package iterable.pattern;



public class DaleArrayListIterator implements Iterator {

	private DaleArrayList dataStruct;
	private int index = 0;
	
	public DaleArrayListIterator(DaleArrayList anArray)
	{
		dataStruct = anArray;
		
	}
	public boolean hasNext() {
		return index < dataStruct.getSize();

	}

	public int next() {
		
		return dataStruct.get(index++);
		
	}

}
