package dispatching;
//overloading uses static (compile-time) selection; 
//it's based on the class type of the parameter 
public class StaticBinding {

	public static void main(String[] args)
	{
		System.out.println(new  StaticBinding().doit("Foo"));
		String foo = "foo";
		new  StaticBinding().redirector(foo);
		new Confusing(null);
	}
	
	public void redirector(Object p)
	{
		System.out.println(new  StaticBinding().doit(p));
	}
	
	public void doit(int p) {}
	public String doit(long p){return "long";}
	public String doit(double p){return "double";}
	public String doit(String p){return "String";}
	public String doit(Object p){return "Object";}

}

class Confusing
{
	public Confusing(Object p)
	{
		System.out.println("Object");
	}
	
	public Confusing(double[] p)
	{
		System.out.println("Double array");
	}

}
