package clonable;

public class FunStruff 
{
	public static void main(String[] args)
	{
		String plinkette = "I am not a robot";
		plinkette = "yes";
		
		System.out.println(plinkette);
		
		Lou louie = new Lou();
		
	}
}

class Lou
{
	private void sayHey()
	{
		System.out.println("hey");
	}
}
