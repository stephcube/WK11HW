package mySQLweek5;

import java.util.LinkedList;
import java.util.List;

public class Pizza {

private String name; {
	this.name = getName();
	
}
	private static final List<Pizza> pizzas = List.of(
		new Pizza("Pepperoni"),
		new Pizza("Ultimate Veggie"),
		new Pizza("BBQ Cowboy"),
		new Pizza("Supreme"),
		new Pizza("Midwestern Taco"));
	
	public Pizza(String name) {
		this.name = name;	

}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name + " Pizza";
	}

	public int compare(Pizza that) {
		return this.name.compareTo(that.name);
	}
	public static List<Pizza> getPizzas() {
		return new LinkedList<>(pizzas);
	}
}

