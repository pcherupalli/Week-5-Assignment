package com.state.pizza;

public class Pizza {
	
	
	PizzaState bakePizza;
	
	PizzaState cutPizza;
	
	PizzaState packPizza;
	
	PizzaState state;
	
	
	public Pizza () {
		
		bakePizza = new BakePizza(this);
		cutPizza = new CutPizaa(this);
		packPizza = new PackPizza(this);
		
		state= bakePizza;
		
	}

	// Getters and setters
	public PizzaState getBakePizza() {
		return bakePizza;
	}


	public void setBakePizza(PizzaState bakePizza) {
		this.bakePizza = bakePizza;
	}


	public PizzaState getCutPizza() {
		return cutPizza;
	}


	public void setCutPizza(PizzaState cutPizza) {
		this.cutPizza = cutPizza;
	}


	public PizzaState getPackPizza() {
		return packPizza;
	}


	public void setPackPizza(PizzaState packPizza) {
		this.packPizza = packPizza;
	}


	public PizzaState getState() {
		return state;
	}


	public void setState(PizzaState state) {
		this.state = state;
	}
	
	//Methods 
	
	public void cookPizza() {
		state.bakePizza();
	}

	public void slicePizza() {
		state.cutPizza();
	}
	
	public void packPizza() {
		state.packPizza();
	}
	
}
