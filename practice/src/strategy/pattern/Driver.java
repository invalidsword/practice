package strategy.pattern;

public class Driver 
{

	public static void main(String[] args) 
	{
		choosTaxMethod aTaxMethod = new choosTaxMethod(new taxByPercentage());
		System.out.println(aTaxMethod.executeTaxMethod(50000));
		
		aTaxMethod = new choosTaxMethod(new taxByConstant());
		System.out.println(aTaxMethod.executeTaxMethod(50000));
		
		

	}

}
