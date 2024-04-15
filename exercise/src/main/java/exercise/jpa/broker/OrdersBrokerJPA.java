package exercise.jpa.broker;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import exercise.model.Orders;

public class OrdersBrokerJPA extends BrokerBaseJPA<Orders> {

	@Override
	public Orders get(int value) {
	    EntityManager entityManager = getEntityManager();
	    Query query = entityManager.createQuery("select o from Orders o where order_id =: orderID");
	    query.setParameter("orderID", value);
	    Orders order = (Orders)query.getSingleResult();
	    entityManager.close();
	    
	    return order;
	}

	@Override
	public List<Orders> getAll() {
		EntityManager entityManager = getEntityManager();
		List<Orders> orders = (List<Orders>) entityManager.createQuery("select o from Orders o", Orders.class).getResultList();
		entityManager.close();
		
		return orders;
	}

}
