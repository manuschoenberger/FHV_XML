package seminar.jpa.broker;

import java.util.List;

import javax.persistence.EntityManager;

import seminar.model.Person;

public class PersonBroker extends BrokerBase<Person>{
	
	public Person getPersonByID(String persno) {
		EntityManager entityManager = factory.createEntityManager();
		Person p = entityManager.find(Person.class, persno);
		
		return p;
	}

	@Override
	public List<Person> getAll() {
		EntityManager entityManager = factory.createEntityManager();
		List<Person> persons = entityManager.createQuery("from Person").getResultList();
		
		return persons;
	}
	
	// insert und delete ist bereits im BaseBroker implementiert
	
}
