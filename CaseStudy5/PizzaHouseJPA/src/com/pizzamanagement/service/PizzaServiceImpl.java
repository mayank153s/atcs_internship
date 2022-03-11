package com.pizzamanagement.service;

import com.pizzamanagement.Dao.PizzaDao;
import com.pizzamanagement.Dao.PizzaDaoImpl;
import com.pizzamanagement.model.Pizza;

public class PizzaServiceImpl implements PizzaService {
	private PizzaDao dao;
	public PizzaServiceImpl() {
		// TODO Auto-generated constructor stub
		dao=new PizzaDaoImpl();
	}

	@Override
	public void addPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addPizza(pizza);
		dao.commitTransaction();
	}

	@Override
	public void updatePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updatePizza(pizza);
		dao.commitTransaction();

	}

	@Override
	public void deletePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		dao.commitTransaction();
		dao.deletePizza(pizza);
		dao.beginTransaction();
	}

	@Override
	public Pizza findPizzaByNo(int id) {
		// TODO Auto-generated method stub
		Pizza pizza =dao.getPizzaByNo(id);
		return pizza;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
