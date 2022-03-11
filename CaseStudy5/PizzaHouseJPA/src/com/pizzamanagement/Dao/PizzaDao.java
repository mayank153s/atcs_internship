package com.pizzamanagement.Dao;

import com.pizzamanagement.model.Pizza;
import com.pizzamanagement.service.PizzaService;

public interface PizzaDao{
	public void addPizza(Pizza pizza);
	public void updatePizza(Pizza pizza);
	public void deletePizza(Pizza pizza);
	public Pizza getPizzaByNo(int id);
	
	void beginTransaction();
	void commitTransaction();
}
