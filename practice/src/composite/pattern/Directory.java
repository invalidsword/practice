package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {
	private String aName;
	private List<AbstractFile> aFiles = new ArrayList<AbstractFile>();
	
	public Directory(String pName)
	{
		aName = pName;
	}

	public void ls() {
		System.out.println("This is Directory: " + aName);
		
		for(AbstractFile file: aFiles)
		{
			System.out.println(file.getName() +  ((File)file).aValue);
		}
	}

	public String getName() {
		return aName;
	}

	public void add(AbstractFile pFile) {
		aFiles.add(pFile);
	}

	public void remove(AbstractFile pFile) {
		aFiles.remove(pFile);
	}

	public File getChild(int aIndex)
	{
		return (File)aFiles.get(aIndex);
	}
}
