package exercise.jdbc.facade;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exercise.jdbc.broker.CustomerBrokerJDBC;
import exercise.model.Categorie;
import exercise.model.Customer;
import exercise.model.Employee;
import exercise.model.OrderDetail;
import exercise.model.Orders;
import exercise.model.Product;
import exercise.model.Shipper;
import exercise.model.Supplier;

public class DatabaseFacadeJDBC implements IDatabaseFacadeJDBC {

	public void insert(Object value) {
		
		if (value instanceof Customer) {
			CustomerBrokerJDBC cb  = new CustomerBrokerJDBC();
			try {
				cb.insert((Customer) value);
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		if (value instanceof Shipper) {
			// delegieren an DepartmentBroker analog zum CustomerBroker
		}
		
		if (value instanceof Orders) {
			// delegieren an ProjectBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Employee) {
			// delegieren an EmployeeBroker analog zum CustomerBroker 
		}
		
		if (value instanceof OrderDetail) {
			// delegieren an Order_DetailBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Categorie) {
			// delegieren an CategorieBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Supplier) {
			// delegieren an SupplierBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Product) {
			// delegieren an ProductBroker analog zum CustomerBroker 
		}
		
	}
	
	public void update(Object value) {
		
		if (value instanceof Customer) {
			CustomerBrokerJDBC cb  = new CustomerBrokerJDBC();
			try {
				cb.update((Customer) value);
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		if (value instanceof Shipper) {
			// delegieren an DepartmentBroker analog zum CustomerBroker
		}
		
		if (value instanceof Orders) {
			// delegieren an ProjectBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Employee) {
			// delegieren an EmployeeBroker analog zum CustomerBroker 
		}
		
		if (value instanceof OrderDetail) {
			// delegieren an Order_DetailBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Categorie) {
			// delegieren an CategorieBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Supplier) {
			// delegieren an SupplierBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Product) {
			// delegieren an ProductBroker analog zum CustomerBroker 
		}
		
	}

	public void delete(Object value) {
		
		if (value instanceof Customer) {
			CustomerBrokerJDBC cb  = new CustomerBrokerJDBC();
			try {
				cb.remove((Customer) value);
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		if (value instanceof Shipper) {
			// delegieren an DepartmentBroker analog zum CustomerBroker
		}
		
		if (value instanceof Orders) {
			// delegieren an ProjectBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Employee) {
			// delegieren an EmployeeBroker analog zum CustomerBroker 
		}
		
		if (value instanceof OrderDetail) {
			// delegieren an Order_DetailBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Categorie) {
			// delegieren an CategorieBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Supplier) {
			// delegieren an SupplierBroker analog zum CustomerBroker 
		}
		
		if (value instanceof Product) {
			// delegieren an ProductBroker analog zum CustomerBroker 
		}
		
	}

	public List<Customer> getAllCustomers() {
		
		List<Customer> customers = new ArrayList<Customer>();
		CustomerBrokerJDBC cb = new CustomerBrokerJDBC();
		
		try {	
			customers = cb.getAll();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customers;
	}

	public Customer getCustomerByID(int id) {
		
		CustomerBrokerJDBC customerBroker = new CustomerBrokerJDBC();
		Customer customer = null;
		
		try {
			customer = customerBroker.getById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customer;
	}

	public List<Shipper> getAllShippers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Shipper getShipperByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	public Orders getOrdersByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<OrderDetail> getAllOrderDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderDetail getOrderDetailByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	public Categorie getCategorieByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Supplier getSupplierByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProductByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
