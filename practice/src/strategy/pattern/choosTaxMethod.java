package strategy.pattern;

public class choosTaxMethod 
{
	private taxMethod taxMethod;
	
	public choosTaxMethod(taxMethod pTaxMethod)
	{
		taxMethod = pTaxMethod;
	}
	
	public int executeTaxMethod(int funds)
	{
		return taxMethod.taxAmount(funds);
	}
}
