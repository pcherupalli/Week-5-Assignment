package com.state.pizza;

public class BakePizza implements PizzaState {

	Pizza pizza;
	
	
	
	public BakePizza(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public void bakePizza() {
		// TODO Auto-generated method stub
        System.out.println("Pizza is baking process");
        pizza.setState(pizza.getBakePizza());
	}

	@Override
	public void cutPizza() {
		// TODO Auto-generated method stub
		 System.out.println("Once its baked cut the pizza");
	}

	@Override
	public void packPizza() {
		// TODO Auto-generated method stub
		 System.out.println("In baking process");
	}

}
