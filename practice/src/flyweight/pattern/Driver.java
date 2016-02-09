package flyweight.pattern;

public class Driver 
{
	 public static void main(String[] args) 
	 {
		 
		 Chair chaise = (Chair)ChairFactory.getChair("plastic");
		 chaise.setColour("green");
		 chaise.setSize(12);
		 
		 System.out.println(chaise.getInfo());
		 
		 Chair chairtoo = (Chair)ChairFactory.getChair("plastic");
		 
		 System.out.println(chairtoo.getInfo());
		 
	 }
	 
	 
}
