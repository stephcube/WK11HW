package mySQLweek5;

import java.util.List;

public class PizzaSorter {

	public static void main(String[] args) {
	new PizzaSorter().run(); }

	private void run() {
		boolean sortWithLambda = false;
		List<Pizza> pizzas;
		String name;
		
		System.out.println("Original: " + Pizza.getPizzas());
		
		if(sortWithLambda) {
			pizzas = sortWithLambda();
			name = "Lambda Sort: ";
	}
		else {
			pizzas = (List<Pizza>) sortWithMethodReference();
			name = "Method Reference Sort: ";
		}
		
		System.out.println(name + pizzas);
}
	
	private Object sortWithMethodReference() {
		List<Pizza> pizzas = Pizza.getPizzas();
		
		pizzas.sort(Pizza::compare);
	
		return pizzas;
	}

	private List<Pizza> sortWithLambda() {
		List<Pizza> pizzas = Pizza.getPizzas();
		
		pizzas.sort((p1, p2) -> p1.compare(p2));
		
		return pizzas;
	}
}
