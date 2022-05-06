package mySQLweek5;

import java.util.NoSuchElementException;
import java.util.Optional;

public class PizzaOptional {

	public static void main(String[] args) {
		new PizzaOptional().run();

	}

	private void run() {
		Optional<Pizza> value = Optional.of(new Pizza("Hawaiian"));
		Pizza pizza = pizzaMethod(value);
		System.out.println("I have a " + pizza + ".");
		
		try {
		 Optional<Pizza> empty = Optional.empty();
		 pizzaMethod(empty);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());		
		}
	}
	
	private Pizza pizzaMethod(Optional<Pizza> pizzaOptional) {
		
	return pizzaOptional.orElseThrow(() 
	-> new NoSuchElementException("The pizza does not exist."));
	
	}
}
