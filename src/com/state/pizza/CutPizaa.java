package com.state.pizza;

public class CutPizaa implements PizzaState {

	Pizza pizza;
	
	
	
	public CutPizaa(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public void bakePizza() {
		// TODO Auto-generated method stub
      System.out.println("Pizza got baked ready to slice");
	}

	@Override
	public void cutPizza() {
		// TODO Auto-generated method stub
		 System.out.println("Cut the pizza according to the size");
		 pizza.setState(pizza.getCutPizza());
	}

	@Override
	public void packPizza() {
		// TODO Auto-generated method stub
		 System.out.println("Once its sliced ready pack ");

	}

}
