package exercise.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "northwind.employee")
public class Employee {

	private int employeeId;
	private String lastname;
	private String firstname;
	private String title;
	private String titleOfCourtesy;
	private LocalDate birthdate;
	private LocalDate hiredate;
	private String address;
	private String city;
	private String region;
	private String postalCode;
	private String country;
	private String homePhone;
	private String extension;
	private String photo;
	private String notes;
	private Employee reportsTo;
	
	private List<Orders> orders;
	private List<Employee> subEmployees;

	@Id
	@Column(name = "employee_id")
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "lastname")
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "firstname")
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "title_of_courtesy")
	public String getTitleOfCcourtesy() {
		return titleOfCourtesy;
	}
	public void setTitleOfCcourtesy(String titleOfCcourtesy) {
		this.titleOfCourtesy = titleOfCcourtesy;
	}

	@Column(name = "birthdate")
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Column(name = "hiredate")
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	@Column(name = "address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "region")
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	@Column(name = "postal_code")
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Column(name = "country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "home_phone")
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	@Column(name = "extension")
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Column(name = "photo")
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "notes")
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@ManyToOne
	@JoinColumn(name = "reports_to")	
	public Employee getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(Employee reportsTo) {
		this.reportsTo = reportsTo;
	}

	@OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@OneToMany(mappedBy = "reportsTo", fetch = FetchType.EAGER)
	public List<Employee> getSubEmployees() {
		return subEmployees;
	}
	public void setSubEmployees(List<Employee> subEmployees) {
		this.subEmployees = subEmployees;
	}
	
	@Override
	public String toString() {
		return "Employee [Employee - ID = " + employeeId + ", Lastname = " + lastname + ", Firstname = " + firstname + ", Title = "
				+ title + "]";
	}

}
