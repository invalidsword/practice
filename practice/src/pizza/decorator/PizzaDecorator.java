package pizza.decorator;

public abstract class PizzaDecorator implements Pizza{

	Pizza pizzaInProgress;
	
	public PizzaDecorator(Pizza pizza){
		pizzaInProgress = pizza;
	}
	
	public String listIngredient() {
		return pizzaInProgress.listIngredient();
	}

}
