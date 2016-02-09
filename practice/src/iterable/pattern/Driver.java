package iterable.pattern;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DaleArrayList myArray = new DaleArrayList();
		myArray.add(2);
		myArray.add(3);
		myArray.add(4);
		myArray.add(5);
		myArray.add(6);
		myArray.add(7);
		myArray.add(8);
		myArray.add(9);
		myArray.add(10);
		
		Iterator myArrayIterator = myArray.getIterator();

		while(myArrayIterator.hasNext())
		{
			System.out.println(myArrayIterator.next());
		}
		

	}

}
