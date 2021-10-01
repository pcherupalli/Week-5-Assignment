package com.state.pizza;

public class PackPizza implements PizzaState {

	Pizza pizza;

	public PackPizza(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public void bakePizza() {
		// TODO Auto-generated method stub
		System.out.println("pizza baked already");
	}

	@Override
	public void cutPizza() {
		// TODO Auto-generated method stub
		System.out.println("pizza cut already");
	}

	@Override
	public void packPizza() {
		// TODO Auto-generated method stub
		System.out.println("Packing done. ready to serve the customers");
		pizza.setState(pizza.getPackPizza());
	}

}
