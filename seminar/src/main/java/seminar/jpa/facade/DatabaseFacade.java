package seminar.jpa.facade;

import java.util.List;

import seminar.jpa.broker.PersonBroker;
import seminar.model.Person;

public class DatabaseFacade {

	public List<Person> getAllPersons() {
		return new PersonBroker().getAll();
	}
	
	public void insertPerson(Person value) {
		new PersonBroker().insert(value);
	}
	
	public Person getPersonByID(String persno) {
		return new PersonBroker().getPersonByID(persno);
	}
	
}
