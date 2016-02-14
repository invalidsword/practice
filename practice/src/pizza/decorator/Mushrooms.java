package pizza.decorator;

public class Mushrooms extends PizzaDecorator{
	public Mushrooms(Pizza pizza){
		super(pizza);
	}
	
	public String listIngredient() {
		return super.listIngredient() + ", with mushroom";
	}
}
