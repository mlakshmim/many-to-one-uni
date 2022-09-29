package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveFoodOrder {

	public static void main(String[] args) {

		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setName("Lakshmi");
		foodOrder.setStatus("Preparing");

		Items items = new Items();
		items.setName("Veg_Biriyani");
		items.setQty(1);
		items.setCost(250);

		Items items1 = new Items();
		items1.setName("Masala_Dosa");
		items1.setQty(2);
		items1.setCost(150);

		
		items.setFoodOrder(foodOrder);
		items1.setFoodOrder(foodOrder);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityManager.persist(items);
		entityManager.persist(items1);
		entityTransaction.commit();

	}

}
