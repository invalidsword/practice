package composite.pattern;

public class Driver 
{

	public static void main(String[] args)
	{
		Directory dir1 = new Directory("dir1");
		
		File file1 = new File("file1", 1);
		File file2 = new File("file2", 2);
		File file3 = new File("file3", 3);
		File file4 = new File("file4", 4);
		
		dir1.add(file1);
		dir1.add(file2);
		dir1.add(file3);
		dir1.add(file4);
		
		dir1.ls();
	}
}
