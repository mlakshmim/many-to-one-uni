package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospital {

	public static void main(String[] args) {
       Hospital hospital=new Hospital();
       hospital.setName("Sparsh");
       hospital.setWebsite("www.sparsh.com");
       
       Branch branch=new Branch();
       branch.setLocation("BTM Layout");
       branch.setCity("Bangalore");
       branch.setPhone(9875461235l);
       
       Branch branch1=new Branch();
       branch1.setLocation("Chamrajpeta");
       branch1.setCity("Mysore");
       branch1.setPhone(9875251235l);
       
       branch.setHospital(hospital);
       branch1.setHospital(hospital);
       
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch);
		entityManager.persist(branch1);
		entityTransaction.commit();

	}

}
