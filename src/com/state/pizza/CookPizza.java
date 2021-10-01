package com.state.pizza;

public class CookPizza {
	
	public static void main(String[] args) {
		
		//State pattern to cook pizza
		Pizza pizza = new Pizza();
		
		pizza.cookPizza();
		pizza.slicePizza();
		pizza.packPizza();
		
		
	}

}
