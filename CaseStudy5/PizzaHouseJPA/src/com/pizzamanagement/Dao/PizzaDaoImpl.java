package com.pizzamanagement.Dao;

import com.pizzamanagement.model.Pizza;
import javax.persistence.EntityManager;


public class PizzaDaoImpl implements PizzaDao {
	private EntityManager entityManager;
	public PizzaDaoImpl() {
		// TODO Auto-generated constructor stub
		entityManager = JPAUtil.getEntityManger();
	}

	@Override
	public void addPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		entityManager.persist(pizza);
	}

	@Override
	public void updatePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		entityManager.merge(pizza);
	}

	@Override
	public void deletePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		entityManager.remove(pizza);
	}

	@Override
	public Pizza getPizzaByNo(int id) {
		// TODO Auto-generated method stub
		Pizza pizza = entityManager.find(Pizza.class, id);
		return pizza;
	}
	
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
	

}
