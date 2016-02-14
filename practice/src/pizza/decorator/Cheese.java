package pizza.decorator;

public class Cheese extends PizzaDecorator{
	public Cheese(Pizza pizza){
		super(pizza);
	}
	
	public String listIngredient() {
		return super.listIngredient() + ", with cheese";
	}
}
