package exercise.jpa.broker;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import exercise.model.Customer;

public class CustomerBrokerJPA extends BrokerBaseJPA<Customer> {

	@Override
	public Customer get(int value) {
	    EntityManager entityManager = getEntityManager();
	    Query query = entityManager.createQuery("select c from Customer c where customer_id =: customerID");
	    query.setParameter("customerID", value);
	    Customer cus = (Customer)query.getSingleResult();
	    entityManager.close();
	    
	    return cus;
	}

	@Override
	public List<Customer> getAll() {
		EntityManager entityManager = getEntityManager();
		List<Customer> customers = (List<Customer>) entityManager.createQuery("select c from Customer c", Customer.class).getResultList();
		entityManager.close();
		
		return customers;
	}

}
