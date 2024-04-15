package seminar;

import java.util.List;

import seminar.jdbc.facade.IDatabaseFacade;
import seminar.jdbc.facade.JDBCDatabaseFacade;
import seminar.model.Person;

public class TestApplication {
	
	public static void main(String[] args) {
		
		IDatabaseFacade facade = new JDBCDatabaseFacade();
		List<Person> personList = facade.getAllPersons();
		
		for (Person p : personList) {
			System.out.println(p.getLname());
		}
	}
}