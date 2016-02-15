package iterable.pattern;

public class DaleArrayList 
{

	private int[] data = new int[10];
	private int index = 0;
	
	public void add(int element){
		
		if(index == data.length) //array is full
		{
			int[] newdata = new int[data.length * 2];
			
			for (int i = 0; i < index; i++){
				newdata[i] = data[i];
			}
			
			data = newdata;
		}
		
		data[index] = element;
		index++;
	}
	
	public int get(int i){
		return data[i];
	}
	
	public int getSize(){
		return index;
	}
	
	public Iterator getIterator(){
		return new DaleArrayListIterator(this);
	}


}
