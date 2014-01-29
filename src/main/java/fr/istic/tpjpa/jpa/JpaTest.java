package fr.istic.tpjpa.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		try {
			test.createPersonne();
			} catch (Exception e) {
			e.printStackTrace();
			}
		// TODO persist entity

		tx.commit();

		// TODO run request
		test.listPersonne();
		manager.close();
		System.out.println(".. done");
	}
	
	private void createPersonne() {
		int numOfEmployees = manager.createQuery("Select a From Employee a",
		Personne.class).getResultList().size();
		if (numOfPersonne == 0) {
		String nom = new String ("java");
		manager.persist(department);
		manager.persist(new Personne("Jakab Gipsz",department));
		manager.persist(new Personne("Captain Nemo",department));
		}
		}

}
