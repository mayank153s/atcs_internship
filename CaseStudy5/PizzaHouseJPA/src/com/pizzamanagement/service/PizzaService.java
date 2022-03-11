package com.pizzamanagement.service;

import com.pizzamanagement.model.Pizza;

public interface PizzaService {
	
	public void addPizza(Pizza pizza);
	public void updatePizza(Pizza pizza);
	public void deletePizza(Pizza pizza);
	public Pizza findPizzaByNo(int id);
	
}
