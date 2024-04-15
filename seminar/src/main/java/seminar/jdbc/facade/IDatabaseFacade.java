package seminar.jdbc.facade;

import java.util.List;

import seminar.model.Department;
import seminar.model.Person;
import seminar.model.Project;

public interface IDatabaseFacade {
	
	// INSERT + UPDATE
	public void save(Object value);
	
	// DELETE
	public void delete(Object value);
	
	// READ
	public List<Person> getAllPersons();
	public Person getPersonByID(int id);
	
	public List<Department> getAllDepartments();
	public Department getDepartmentByID(int id);
	
	public List<Project> getAllProjects();
	public Project getProjectByID(int id);
}