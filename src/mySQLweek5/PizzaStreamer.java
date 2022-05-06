package mySQLweek5;

import java.util.stream.Collectors;

public class PizzaStreamer {

	public static void main(String[] args) {
	new PizzaStreamer().run();

	}

	private void run() {
		String names = Pizza.getPizzas()
		.stream()
		.map(p -> p.toString())
		.sorted()
		.collect(Collectors.joining(",\n"));
		
		System.out.println(names);
	}

}
