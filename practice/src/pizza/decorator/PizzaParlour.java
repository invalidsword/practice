package pizza.decorator;

public class PizzaParlour {

	public static void main(String[] args){
		Pizza newPizza = new Mushrooms(new Cheese(new PlainPizza()));
		
		System.out.println(newPizza.listIngredient());
	}
}
