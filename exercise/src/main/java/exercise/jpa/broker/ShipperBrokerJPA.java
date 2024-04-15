package exercise.jpa.broker;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import exercise.model.Shipper;

public class ShipperBrokerJPA extends BrokerBaseJPA<Shipper> {
	
	@Override
	public Shipper get(int value) {
	    EntityManager entityManager = getEntityManager();
	    Query query = entityManager.createQuery("select s from Shipper s where shipper_id =: shipperID");
	    query.setParameter("shipperID", value);
	    Shipper ship = (Shipper)query.getSingleResult();
	    entityManager.close();
		
		return ship;
	}

	@Override
	public List<Shipper> getAll() {
		EntityManager entityManager = getEntityManager();
		List<Shipper> shippers = (List<Shipper>) entityManager.createQuery("select s from Shipper s", Shipper.class).getResultList();
		entityManager.close();
		
		return shippers;
	}
}
