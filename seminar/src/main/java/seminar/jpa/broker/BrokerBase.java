package seminar.jpa.broker;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BrokerBase<T> {
	
	protected static EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersProj");

	public abstract List<T> getAll();
	
	public void insert(T value) {
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(value);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void delete(T value) {
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.remove(value);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
}